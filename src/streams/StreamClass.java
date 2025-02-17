import java.util.*;
import java.util.stream.Collectors;

public class StreamClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println(nums);

        int sum = nums.stream().mapToInt(n->(int)n).sum();
        System.out.println(sum);

        double average = nums.stream().mapToDouble(n->(double)n).average().orElse(0.0);
        System.out.println(average);

        int max = nums.stream().mapToInt(n->(int)n).max().orElse(Integer.MIN_VALUE);
        System.out.println(max);

        int min = nums.stream().mapToInt(n->(int)n).min().orElse(Integer.MAX_VALUE);
        System.out.println(min);

        nums.stream().filter(n->n%2==0).forEach(n->System.out.print(n + " "));
        System.out.println("");

        List<Integer> resultOdd = nums.stream().filter(n->n%2 == 1).collect(Collectors.toList());
        System.out.println(resultOdd);

        List<String> names = Arrays.asList("Beta","Kt","Alpha","Omega","Chi","Cheta");
        List<String> result = names.stream().filter(n->n.length() >= 4).collect(Collectors.toList());

        System.out.println(result);
        names.stream().filter(n->n.startsWith("C")).forEach(n->System.out.print(n + " "));



    }
}