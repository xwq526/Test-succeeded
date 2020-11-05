package test20201102;
//实现 ArraysList 类
class MyArrayList <T> {
    public T[] elem;
    public int usedSize;
    public MyArrayList() {
        this.elem = (T[]) new Object[10];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    //尾插法
    public void lastAdd(T data) {
        if (this.usedSize == this.elem.length) {
            System.out.println("顺序表已经满了");
            return;
        }
        this.elem[this.usedSize++] = data;
    }
    //打印顺序表
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
    //在pos位置新增元素
    public void add(int pos ,T data) {
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("位置不合法");
            return;
        }
        if (this.usedSize == elem.length) {
            System.out.println("顺序表已经满了");
        }
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    //判断是否包含某个元素
    public boolean contains(T data) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == data) {
                return true;
            }
        }
        return false;
    }
    //查找某个元素的位置
    public int search(T data) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == data) {
                return i;
            }
        }
        return -1;
    }
    //获得pos的位置的元素
    public T getPos(int pos) throws ArrayIndexOutOfBoundsException {
        if (pos < 0 || pos >this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("pos的位置不合法");
        }
        return this.elem[pos];
    }
    //给pos位置的元素设置为value
    public void setPos(int pos , T value) {
        if (pos < 0 || pos >this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("pos的位置不合法");
        }
        this.elem[pos] = value;
    }
    //删除第一次出现的关键字key
    public void remove(T toRemove) {
        int index = search(toRemove);
        if (index == -1) {
            System.out.println("没有这个");
            return;
        }
        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }
    //获取顺序表的长度
    public int size() {
        return this.usedSize;
    }
    public void clear() {
        for (int i = 0; i < this.usedSize; i++) {
            elem[i] = null;
        }
        this.usedSize = 0;
    }

}

public class TestDemo07 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.lastAdd(1);
        list.lastAdd(2);
        list.lastAdd(3);
        list.lastAdd(4);
        list.lastAdd(5);
        list.lastAdd(6);
        list.add(2,89);
//        System.out.println(list.getPos(56));
        list.display();
        list.clear();
        System.out.println("===============");
        list.display();
        System.out.println(list.getUsedSize());
    }
}
