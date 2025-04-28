package customExceptionandtry_catch_finally;

public class NewExceptionClass {
    public static void main(String[] args) {
        AgeExceptionClass AEC = new AgeExceptionClass();
        int age=19;
        try{
            AEC.AgeExceptionClass(age);
        }catch(NewCustomException e){
            System.out.println( e.getMessage());

        }
    }
}

class NewCustomException extends Exception{
    public NewCustomException(){
        super("Invalid age");
    }
}

class AgeExceptionClass {

    public void AgeExceptionClass(int age) throws NewCustomException{
            if(age >= 18){
                System.out.println("Valid age");
            }
            else{
                throw new NewCustomException();
            }
    }
}