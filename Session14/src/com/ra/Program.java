package com.ra;

public class Program {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");
        Thread t3 = new Thread(new RunnableImpl("Thread C"));
        Thread t4 = new Thread(new RunnableImpl("Thread D"));
        Thread t5 = new Thread(() -> {
            for (int i = 1; i <= 100; i++)
                System.out.println("Thread E: " + i);
        });
        Thread t6 = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        // Tác vụ mà luồng cần xử lý khi được start();
        for (int i = 1; i <= 100; i++)
            System.out.println(threadName + ": " + i);
    }
}

class RunnableImpl implements Runnable {

    private String threadName;

    public RunnableImpl(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println(threadName + ": " + i);
    }
}
