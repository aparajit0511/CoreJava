package inheritance;

public class ChildClass extends ParentClass{
    public void flashLights(){
        System.out.println("Flashing Lights");
    }

    @Override
    public void sound(){
        System.out.println("Child sound");
    }
}
