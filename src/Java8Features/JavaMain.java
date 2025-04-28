package Java8Features;

import java.util.*;

public class JavaMain {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("Aparajit");
        name.ifPresent(System.out::println);

        @FunctionalInterface
        interface MathOperator{
            int operate(int a,int b);
        }


        MathOperator addition = (a,b) -> a + b;
        System.out.println(addition.operate(5,3));

    }

}
