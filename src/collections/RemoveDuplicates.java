package collections;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,9,4,5,2,9,1);
        System.out.println(nums);

        HashSet<Integer> numsSet = new HashSet<>();
        LinkedHashSet<Integer> numLSet = new LinkedHashSet<>();

        for (Integer element:nums) {
            numsSet.add(element);
            numLSet.add(element);
        }
        // unordered list
        System.out.println(numsSet);

        // ordered list
        System.out.println(numLSet);
    }

}
