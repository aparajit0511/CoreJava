import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Lambda Expressions
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(n -> System.out.println(n*2));
        System.out.println("----------Break-------------");

        // Functional Interface
            MathOperation addition = (a,b)-> a+b;
        System.out.println(addition.operate(5,3));

        System.out.println("----------Break--------------");

        // Stream API
        List<String> names = Arrays.asList("Alice","Bob","Sam");
        names.stream().filter(w->w.startsWith("A")).forEach(System.out::println);

        System.out.println("----------Break--------------");


        // Method References
        List<String> fruits = Arrays.asList("Apple","Banana","Orange");
        fruits.forEach(System.out::println);

        System.out.println("----------Break--------------");

        // Optional class - used to avoid null or null pointer expressions

        Optional<String> name = Optional.ofNullable("Aparajit");
        name.ifPresent(System.out::println);
        }

    @FunctionalInterface
    interface MathOperation{
        int operate(int a, int b);
    }
    }
