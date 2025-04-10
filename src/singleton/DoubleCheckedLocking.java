package singleton;

public class DoubleCheckedLocking {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable(){
           public void run(){
               Singleton singleton = Singleton.getInstance();
           }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                Singleton singleton = Singleton.getInstance();
            }
        });

        t1.start();
        t2.start();

    }
}

class Singleton{
    private static volatile Singleton obj;
    // volatile is used so that the Thread always sees the latest value
    // static is used here so only one instance can be shared

    // private constructor so the Singleton cant be accessed from the outside
    private Singleton(){
        System.out.println("Instance Created");
    }

    public static Singleton getInstance(){
        // static is used here so we can access getInstance method without an object
        if(obj == null){
            // synchronized block ensures only one thread can enter during initialization
            synchronized (Singleton.class){
                // second check ensures only one instance is created even when multiple threads
                // pass the first null check at the same time
                if(obj == null){
                    obj = new Singleton();
                }
            }
        } // double checked locking to make thread more safe
        return obj;
    }
}
