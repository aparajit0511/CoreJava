package threads;

public class ThreadClass {
    public static void main(String[] args) {
        SharedThread sharedThread = new SharedThread();

        Thread thread1 = new Thread(new printOdd(sharedThread));
        Thread thread2 = new Thread(new printEven(sharedThread));
        thread1.start();
        thread2.start();

    }
}

class SharedThread{
    private int number = 1;
    private final int maxNumber = 20;

    public synchronized void printOdd() throws InterruptedException{
        while(number < 20){
            if (number % 2 == 0){
                wait();
            }
            System.out.println("Odd numbers ->"+ number);
            Thread.sleep(500);
            number += 1;
            notify();
        }
    }

    public synchronized void printEven() throws InterruptedException{
        while(number < 20){
            if(number % 2 == 1){
                wait();
            }
            System.out.println("Even numbers ->"+ number );
            Thread.sleep(500);
            number += 1;
            notify();
        }

    }
}

class printOdd implements Runnable{
    private SharedThread sharedThread;

    public printOdd(SharedThread sharedThread){
        this.sharedThread = sharedThread;
    }
    @Override
    public void run() {
        try{
            sharedThread.printOdd();

        }
        catch(InterruptedException e){
            throw new RuntimeException();
        }

    }
}

class printEven implements Runnable{
    private SharedThread sharedThread;

    public printEven(SharedThread sharedThread){
        this.sharedThread = sharedThread;
    }
    @Override
    public void run() {
        try{
            sharedThread.printEven();

        }catch(InterruptedException e){
            throw new RuntimeException();
        }
    }
}
