package customExceptionandtry_catch_finally;

public class NewException {
    public static void main(String[] args) {
        MyException1 me = new MyException1();
        int age= 19;
        try{
            me.MyException1(age);
        }catch(CustomException1 e){
            throw new RuntimeException(e);
        }
    }
}

class CustomException1 extends Exception{
    public CustomException1(){
        super();
    }

}

class MyException1{
    public void MyException1(int age) throws CustomException1{
        if(age > 18){
            System.out.println("Valid Age");
        }else{
            throw new CustomException1();
        }
    }
}
