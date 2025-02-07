package collections;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = new String("leetcode");
        List<Character> strChars = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        System.out.println(strChars);

        HashSet<Character> hashSet = new HashSet<Character>();

        for (Character character:strChars) {
           if(!hashSet.contains(character)){
               hashSet.add(character);
           }else{
               System.out.println("First Repeating character-> " + character);
               break;
           }
        }
    }
}
