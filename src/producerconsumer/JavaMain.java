package producerconsumer;

public class JavaMain {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(new Producer(sharedResource));
        Thread thread2 = new Thread(new Consumer(sharedResource));

        thread1.start();
        thread2.start();
    }
}

class SharedResource{
    private int number = 0;
    private final int maxNum = 10;
    private boolean isAvailable = false;

    public synchronized void Producer() throws InterruptedException{
        while(number < maxNum){
            while(isAvailable){ // Use while instead of if to avoid spurious wakeups
                wait();
            }
            Thread.sleep(500);
            number += 1;
            System.out.println("Produces number->"+ number);
            isAvailable = true;
            notify();
        }
    }

    public synchronized void Consumer() throws InterruptedException{
        while(number < maxNum){
            while (!isAvailable){
                wait();
            }
            Thread.sleep(500);
            System.out.println("Consumes number->"+ number);
            isAvailable = false;

            notify();
        }

        // Ensure Producer does not wait indefinitely
        // Prevents deadlock
        synchronized (this) {
            notify();
        }
    }
}

class Producer implements Runnable{
    private SharedResource sharedResource;
    public Producer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        try {
            sharedResource.Producer();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Consumer implements Runnable{
    private SharedResource sharedResource;
    public Consumer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        try{
            sharedResource.Consumer();
        }catch(InterruptedException e){
            throw new RuntimeException();
        }
    }
}
