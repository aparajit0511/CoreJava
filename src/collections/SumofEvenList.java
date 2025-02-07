package collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumofEvenList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,2,5,4,6,7,9,8,6,5,4);

        List<Integer> sum = nums.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println(sum);
        System.out.println(sum.stream().mapToInt(i->i.intValue()).sum());
    }
}
