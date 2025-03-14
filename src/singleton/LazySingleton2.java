package singleton;

public class LazySingleton2 {
    private static volatile LazySingleton2 obj;

    private LazySingleton2(){
        System.out.println("Instance created");
    }

    public static synchronized LazySingleton2 getInstance(){
        if(obj == null){
            obj = new LazySingleton2();
        }
        return obj;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(LazySingleton2::getInstance);
        Thread t2 = new Thread(LazySingleton2::getInstance);

        t1.start();
        t2.start();
    }
}
