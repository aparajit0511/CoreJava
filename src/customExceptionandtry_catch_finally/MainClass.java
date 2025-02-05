package customExceptionandtry_catch_finally;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        VoterRegistrationCheck voter = new VoterRegistrationCheck();
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        try{
            voter.voterRegistration(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block");
        }
    }

}

class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super();
    }
}

class VoterRegistrationCheck{
    public void voterRegistration(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException();
        }
        else{
            System.out.println("Voter is eligible to vote");
        }
    }
}
