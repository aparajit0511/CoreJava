package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));
        String reversedString = "";

        for (int i = 0 ; i < words.length;i++){
            String word = words[i];
            String newStr = "";
            char ch;
            for (int j = 0; j < word.length();j++){
                ch = word.charAt(j);
                newStr = ch + newStr;

            }
            reversedString = reversedString + newStr + " ";
        }
        System.out.println("Reversed String ->"+ reversedString);
    }

}
