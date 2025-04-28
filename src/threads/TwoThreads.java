package threads;

public class TwoThreads {
    public static void main(String[] args) {
       SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(new PrintOdd1(sharedResource));
        Thread t2 = new Thread(new PrintEven1(sharedResource));

        t1.start();
        t2.start();
    }
}
class SharedResource{
    int maxNumber = 20;
    int i = 1;

    public synchronized void getOdd() throws InterruptedException{
        while(i < 20){
            if(i % 2 == 0){
                wait();
            }
            System.out.println("Print odd " + i);
            Thread.sleep(500);
            i+=1;
            notify();
        }
    }

    public synchronized void getEven() throws InterruptedException{
        while(i < 20){
            if(i % 2 == 1){
                wait();
            }
            System.out.println("Print even "+ i);
            Thread.sleep(500);
            i+=1;
            notify();
        }
    }
}

class PrintOdd1 implements Runnable{

    private SharedResource sharedResource;

    public PrintOdd1(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        try{
            sharedResource.getOdd();
        }catch(InterruptedException e){
            throw new RuntimeException();
        }
    }
}

class PrintEven1 implements Runnable{

    private SharedResource sharedResource;

    public PrintEven1(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        try{
            sharedResource.getEven();
        }catch(InterruptedException e){
            throw new RuntimeException();
        }
    }
}

// explain whats the use of sharedthread in printodd and printeven class
// why implements Runnable and not extends Thread


