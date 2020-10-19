package test20201019;

public class MyArrayList2 {
    public int[] elem;//数组
    public int usedSize;//有效的数据的个数
    public MyArrayList2() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    public MyArrayList2(int capcity) {
        this.elem = new int[capcity];
        this.usedSize = 0;
    }
    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]);
        }
        System.out.println();
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //判断pos的位置是不是合法
         if (pos < 0 || pos > this.usedSize){
             System.out.println("pos的位置不合适");
             return;
         }
         //判断数组是不是已经满了
         if (this.usedSize == this.elem.length){
             System.out.println("顺序表已经满了");
             return;
         }
         //把pos以及后面的元素往后移
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize ; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize ; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos > this.usedSize){
            System.out.println("pos的位置不合适");
            return -1;
        }
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {

        if (pos < 0 || pos > this.usedSize){
            System.out.println("pos的位置不合适");
            return;
        }
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        //获取index
        int index = search(toRemove);
        if (index == -1){
            System.out.println("没有这个数");
            return;
        }
        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
}
