package test20201019;
import javax.naming.PartialResultException;
public class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效数据的个数

    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    public MyArrayList(int capcity) {
        this.elem = new int[capcity];
        this.usedSize = 0;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {//pos代表下标
        if (this.elem.length == this.usedSize){
            System.out.println("顺序表为满");
            return;
        }
        if (pos < 0 || pos > this.usedSize){
            System.out.println("pos位置不合法");
            return;
        }
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;//注意
    }


    // 打印顺序表
    public void display() {
        for (int i = 0; i <this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <this.usedSize; i++) {
            if (toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize ; i++) {
            if (toFind == this.elem[i]){
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos >= this.usedSize){
            System.out.println("pos位置不合法");
            return -1;
        }
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }
        elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        //1.找到toRemove的位置
        int index = search(toRemove);
        if (index == -1){
            System.out.println("没有这个数字");
            return;
        }
        //2.删除
        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;

        //下面的有待验证
//        for (int i = 0; i < this.usedSize; i++) {
//            if (elem[i] == toRemove){
//                for (int j = i; j < this.usedSize-1; j++) {
//                    elem[j] = elem[j+1];
//                }
//                usedSize--;
//            }else{
//                System.out.println("数据不存在");
//            }
//        }
    }


    //this.usedSize:5
    //  一直发生改变
    //原因：到底是为什么最后一个1没有删   答：不止一个而是刚刚开始usedSize的一半
    //到底usedSize改变的时候，影响的是哪里？    答：i在增加，usedSize在减少，所以remove()只执行了刚刚开始uesdSize的一半；
    public void removeAll(int toRemove) {
        for (int i = this.usedSize-1; i >= 0; i--) {
            remove(toRemove);
        }
//        int count = this.usedSize;
//        for ( int i = 0; i < count; i++) {
//            remove(toRemove);
//        }
    }
    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize =0;
    }

}
