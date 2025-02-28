package collections;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String input = "Learn Java Programming";
        String input1 = input.toLowerCase().replace(" ","");

        String[] chars = input1.split("");
        System.out.println(Arrays.toString(chars));

        HashMap<String,Integer> countChars = new HashMap<>();

        for(int i=0; i<chars.length; i++){
            if(countChars.containsKey(chars[i])){
                countChars.put(chars[i], countChars.get(chars[i])+1);
            }else{
                countChars.put(chars[i],1);
            }
        }

        for(String keys: countChars.keySet()){
            if(countChars.get(keys) > 1){
                System.out.println("Key is " + keys + " having count " + countChars.get(keys));
            }
        }
    }
}
