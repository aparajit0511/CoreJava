package javacodingpractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        HashMap<Character,Integer> hash_table = new HashMap<Character,Integer>();
        ArrayList<Character> result = new ArrayList<>();

        int i  , n = input.length();

        for(i=0;i<n;i++){
            char ch = input.charAt(i);
            if(!hash_table.containsKey(ch)){
                hash_table.put(ch,1);
            }
            else{
                int value = hash_table.get(ch);
                hash_table.put(ch,value+1);
            }
        }

        System.out.println("Character Count"+ hash_table);

        for(Map.Entry<Character,Integer> e:hash_table.entrySet() ){
            if(e.getValue()  > 1){
                result.add(e.getKey());
            }
        }

        System.out.println("Repeated chars are -> "+ result);
    }


}
