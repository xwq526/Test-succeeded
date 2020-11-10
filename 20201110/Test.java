package test20201110;

public class Test {
    public static void main(String[] args) {
        int[] array = { 27,15,19,18,28,34,65,49,25,37};
        TestHeap testHeap = new TestHeap();
        testHeap.initHeap(array);
        System.out.println("=========");
//        testHeap.push(80);
        testHeap.pop();
        System.out.println("=========");

    }
}
