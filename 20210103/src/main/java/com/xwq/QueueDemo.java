package com.xwq;

public class QueueDemo {
    static MyArrayBlockingQueue queue = new MyArrayBlockingQueue();

    static class 生产者 extends Thread {
        @Override
        public void run() {
            setName("生产者");
            while (true) {
                try {
                    queue.offer(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class 消费者 extends Thread {
        @Override
        public void run() {
            setName("消费者");
            while (true) {
                try {
                    queue.poll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            Thread t = new 生产者();
            t.start();
        }

        for (int i = 0; i < 50; i++) {
            Thread t = new 消费者();
            t.start();
        }
    }
}
