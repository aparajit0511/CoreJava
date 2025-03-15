package customExceptionandtry_catch_finally;

public class CustomException {
    public static void main(String[] args) {
        CreateMyException cME = new CreateMyException();
        int age = 19;
        try{
            cME.MyExceptionFunction(age);
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException(){
        super();
    }
}

class CreateMyException {
    public void MyExceptionFunction(int age) throws MyException {
        if (age >= 18) {
            System.out.println("Valid age");
        }else{
            throw new MyException();
        }
    }
}
