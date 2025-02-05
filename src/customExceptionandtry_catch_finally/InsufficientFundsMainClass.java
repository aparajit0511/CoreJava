package customExceptionandtry_catch_finally;

public class InsufficientFundsMainClass {
    public static void main(String[] args) {

    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

class InsufficientFunds{
    public void checkforInsufficientFunds(int amount) throws InsufficientFundsException{
        if (amount < 0){
            throw new InsufficientFundsException;
        }else{
            System.out.println("Funds are sufficient");
        }
    }
}
