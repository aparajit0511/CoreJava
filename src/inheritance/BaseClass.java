package inheritance;

public class BaseClass {
    public static void main(String[] args) {

        ChildClass cc = new ChildClass();
        cc.name = "Makaba";
        cc.makeSound();
        cc.flashLights();

        cc.sound();

    }
}

