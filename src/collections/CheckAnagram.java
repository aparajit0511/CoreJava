package collections;

import java.util.HashMap;

public class CheckAnagram {
    public static void main(String[] args) {
        String input1 = "dam";
        String input2 = "mad";

        HashMap<Character,Integer> word1 = new HashMap<>();
        HashMap<Character,Integer> word2 = new HashMap<>();

        for(int i = 0; i < input1.length(); i++){
            char item = input1.charAt(i);
            if(word1.containsKey(item)){
                word1.put(item,word1.get(item)+1);
            }
            else{
                word1.put(item,1);
            }
        }

        for(int i = 0; i < input2.length(); i++){
            char item = input2.charAt(i);
            if(word2.containsKey(item)){
                word2.put(item,word2.get(item)+1);
            }
            else{
                word2.put(item,1);
            }
        }

        if(word1.equals(word2)){
            System.out.println("String is an anagram");
        }
        else{
            System.out.println("String isnt an anagram");
        }
    }
}
