package javacodingpractice;

import java.util.Scanner;

public class JavaMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        System.out.println("Number printed -> "+number);

        // fibonacci number

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 1;i<=number;i++){
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Print Fibonacci upto "  + number + " is " + c);

        // reverse a number
        int rev = 0,r,at;
        at = number;

        while(number > 0){
             r = number % 10;
            rev = rev * 10 + r;
            number = number / 10;
        }

        System.out.println("Reversed Number -> "+rev);
    }
}
