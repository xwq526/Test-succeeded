package test20201110;

import java.util.Arrays;

public class TestHeap {
    public int[] elem;
    public int usedSize;
    public TestHeap() {
        this.elem = new int[10];
    }
    //这里是做成一个大根堆   （如果要小根堆就大于小于号换一下就行。嘻嘻嘻）
    public void adjustDown(int parent,int len) {//向下调整
        int chlid = 2 * parent + 1;
        //1、首先你得判断是不是有左孩子
        while (chlid < len) {
            //是否有右孩子 如果有  child保存左右孩子最大值的下标
            if (chlid + 1 < len && this.elem[chlid] < this.elem[chlid+1]) {
                chlid++;
            }
            //child当中存储的就是最大值下标
            if (this.elem[chlid] > this.elem[parent]) {
                int tmp = this.elem[chlid];
                this.elem[chlid] = this.elem[parent];
                this.elem[parent] = tmp;
                //下面就是检查改变了节点的child（即赋值后p为根的树）循环条件的改变
                parent = chlid;
                chlid = 2 * parent + 1;
            } else {
                break;
            }
        }
    }
    public void initHeap(int[] array) {//初始化堆
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //建堆的时间复杂度是O(n*logn)
        for (int i = (this.usedSize - 1 - 1) / 2; i >= 0 ; i--) {
            adjustDown(i,usedSize);//调整的时间复杂度是：O(logn)
        }
        System.out.println("===========");//加断点测试用的
    }
    public void adjustUp(int child) {//向上调整，（插入数据用等等）
        int parent = (child - 1) / 2;
        while (child > 0) {//这个循环条件可以换成parent  >= 0
            if (this.elem[parent] < this.elem[child]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }
    public void push(int val) {
        if (isFull()) {//如果满了就扩容
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
        System.out.println("===========");//加断点测试用的
    }
    public boolean isFull() {//判断数组是不是满了
        return this.usedSize == this.elem.length;
    }
    public void pop() {
        //判断是不是为空
        if (isEmpty()) return;
        //交换堆顶和最后一个元素
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize-1];
        this.elem[this.usedSize-1] = tmp;
        this.usedSize--;
        adjustDown(0,this.usedSize);
//        System.out.println("===========");//加断点测试用的



    }
    public boolean isEmpty() {
        return this.usedSize == 0;
    }
}
