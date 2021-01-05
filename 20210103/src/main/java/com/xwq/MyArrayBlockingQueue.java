package com.xwq;

// 线程安全问题 OK
// 通知机制
public class MyArrayBlockingQueue {
    private final Integer[] array = new Integer[5];
    private int size = 0;
    private int headIndex = 0;  // 队列中第一个元素所在下标
    private int rearIndex = 0;  // 队尾中，下一个可以放入元素的下标

    // synchronized 修饰方法，视为对 this 加锁
    public synchronized boolean offer(Integer e) throws InterruptedException {
        // 临界区开始
        while (size >= array.length) {
            wait();
        }

        // size 一定小于 array.length

        array[rearIndex] = e;
        rearIndex++;
        if (rearIndex == array.length) {
            rearIndex = 0;
        }
        size++;
        // 临界区结束

        notify();
        return true;
    }

    public synchronized Integer poll() throws InterruptedException {
        while (size <= 0) {
            wait();
        }
        // size 一定大于 0

        Integer e = array[headIndex];
        headIndex++;
        if (headIndex == array.length) {
            headIndex = 0;
        }
        size--;
        notify();       // 无法做精准唤醒

        return e;
    }
}
