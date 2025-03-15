package deadlock;

public class DeadLockMain {
    // Example of deadlock removal
    private final static Object lock1 = new Object();
    private final static Object lock2 = new Object();
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    try {
                        System.out.println("Thread1 has locked lock1");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException();
                    }
                }
                    System.out.println("Thread1 is trying to lock lock2");
                    synchronized (lock2){
                        System.out.println("Thread1 has locked lock2");
                    }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    try {
                        System.out.println("Thread2 has locked lock1");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException();
                    }
                }
                    System.out.println("Thread2 is trying to lock lock2");
                    synchronized (lock2){
                        System.out.println("Thread2 has locked lock2");
                    }
            }
        });

        thread1.start();
        thread2.start();
    }
}
