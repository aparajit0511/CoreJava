package customExceptionandtry_catch_finally;

import java.util.Scanner;

public class InsufficientFundsMainClass {
    public static void main(String[] args) {
        InsufficientFunds infunds = new InsufficientFunds();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount");
        int funds = scanner.nextInt();

        try{
            infunds.checkforInsufficientFunds(funds);
        }
        catch(InsufficientFundsException e){
            System.out.println("Exception message " + e.getMessage());
        }
        finally{
            System.out.println("Finally exception");
        }
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super();
    }
}

class InsufficientFunds{
    public void checkforInsufficientFunds(int amount) throws InsufficientFundsException{
        if (amount < 0){
            throw new InsufficientFundsException();
        }else{
            System.out.println("Funds are sufficient");
        }
    }
}
