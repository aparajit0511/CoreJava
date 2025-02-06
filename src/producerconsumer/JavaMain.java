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
    private int number = 1;
    private final int maxNum = 20;

    public synchronized void Producer() throws InterruptedException{
        while(number < 20){
            if(number % 2 == 0){
                wait();
            }
            Thread.sleep(500);
            System.out.println("Print Odd->"+ number);
            number += 1;
            notify();
        }
    }

    public synchronized void Consumer() throws InterruptedException{
        while(number < 20){
            if (number % 2 == 1){
                wait();
            }
            Thread.sleep(500);
            System.out.println("PRint Even->"+ number);
            number += 1;
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
