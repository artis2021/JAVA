import java.util.Scanner;

public class CWH_83_ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a < 9){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is arithematic exception.");
            } catch(Exception e){
                System.out.println(e.getMessage());
//                System.out.println();
                e.printStackTrace();
            }
        }
    }
}

class MyException extends Exception{
    public String toString(){
//        return super.toString() + "I am tostring.";
        return "I am toString";
    }

    public String getMessage(){
//        return super.getMessage() + "I am getMessage.";
        return "I am getMessage.";
    }
}
