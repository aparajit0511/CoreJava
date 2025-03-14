package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindCommonElements {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {2,3,7,8,9};

        HashSet<Integer> numsHash = new HashSet<>();
        
        for(int i=0; i<nums1.length;i++){
            numsHash.add(nums1[i]);
        }
        
        for(int i=0;i< nums2.length;i++){
            if(numsHash.contains(nums2[i])){
                System.out.println(nums2[i]);
            }
        }
    }
}
