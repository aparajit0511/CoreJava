package collections;

import java.util.Arrays;
import java.util.HashMap;

public class CountCharacterOccurence {
    public static void main(String[] args) {
        String input = "Java is a stupid language";
        String input1 = input.toLowerCase().replace(" ", "");
        System.out.println(input1);

        String[] words = input1.split("");
        HashMap<String,Integer> hashTable = new HashMap<>();

        for(int i=0; i<words.length; i++){
            if(hashTable.containsKey(words[i])){
                hashTable.put(words[i],hashTable.get(words[i])+1);
            }
            else{
                hashTable.put(words[i],1);
            }
        }

        for(String keys:hashTable.keySet()){
            System.out.println("Key is " + keys + " and its count is " + hashTable.get(keys));
        }


        System.out.println(Arrays.toString(words));
    }
}
