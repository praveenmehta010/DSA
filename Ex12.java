class CustomThread1 extends Thread {
    public void run() {
        int j = 0;
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread 1 -> " + j);
            j = j + 11;
        }
    }
}

class CustomThread2 implements Runnable {
    public void run() {
        int j = 0;
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread 2 -> " + j);
            j += 1;
        }
    }
}

public class Ex12 {
    public static void main(String[] args) {
        CustomThread1 th1 = new CustomThread1();
        CustomThread2 th = new CustomThread2();
        Thread th2 = new Thread(th);
        th1.start();
        th2.start();
    }
}
