package singleton;

public class LazySingleton {
    private static LazySingleton obj;
    // why static?

    private LazySingleton(){
        System.out.println("Instance created");
    }
    // why private constructor

    public static synchronized LazySingleton getInstance(){
        if(obj == null){
             obj = new LazySingleton();
        }
        return obj;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton obj1 = LazySingleton.getInstance();
            }
        });

        Thread thread2 = new Thread(new Runnable(){
          @Override
          public void run(){
              LazySingleton obj2 = LazySingleton.getInstance();
          }
        });

        thread2.start();
        thread1.start();
    }

}
