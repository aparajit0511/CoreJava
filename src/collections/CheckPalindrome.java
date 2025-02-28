package collections;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "madam isi madam";

        int left = 0 , right = input.length()-1;

        while (left < right){
            char leftC = input.charAt(left);
            char rightC = input.charAt(right);

            if (leftC != rightC){
                System.out.println("Not Palindrome");
                break;
            }

            left += 1;
            right -= 1;
        }
        System.out.println("Input is Palindrome");
    }
}
