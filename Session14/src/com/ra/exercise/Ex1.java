package com.ra.exercise;

public class Ex1 {
    public static void main(String[] args) {
        Thread t2 = new EvenThread();
        Thread t1 = new OddThread(t2);

        t1.start();
        t2.start();
        try {
            /**
             * join() đồng bộ 1 hoặc nhiều luồng. Khi một luồng (t1,t2) gọi phương thức join() trên một luồng khác (main thread)
             * Luồng gọi (main thread) sẽ chờ đến khi luồng được gọi phương thước join() (t1,t2)
             * hoàn thành xong mới thực thi tiếp các công việc khác
             * */
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Đã xong!");
    }
}

class OddThread extends Thread {
    private Thread evenThread;
    public OddThread(Thread evenThread) {
        this.evenThread = evenThread;
    }

    @Override
    public void run() {
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}