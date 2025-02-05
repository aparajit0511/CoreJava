package javacodingpractice;

import java.util.Scanner;

public class JavaStringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = scanner.nextLine();

        int start = 0 , end = name.length()-1;

        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        String newString = "";

        while(end >= start){
            char ch2 = name.charAt(end);
            newString += ch2;
            end -= 1;
        }

        System.out.println("New name -> "+newString);
    }
}
