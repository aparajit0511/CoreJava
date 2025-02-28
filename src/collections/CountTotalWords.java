package collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class CountTotalWords {
    public static void main(String[] args) {
        String words = "There are total and total with there but total are total";
        String words1 = words.toLowerCase();

        String[] words2 = words1.split(" ");

        System.out.println(Arrays.toString(words2));
        HashMap<String,Integer> hashTable = new HashMap<>();

        for(int i = 0; i< words2.length; i++){
            String word = words2[i];
            if(hashTable.containsKey(word)){
                hashTable.put(word,hashTable.get(word)+1);
            }else{
                hashTable.put(word,1);
            }
        }

        for(String keys:hashTable.keySet()){
            System.out.println("word is " + keys + " and count is " + hashTable.get(keys));
        }

    }
}
