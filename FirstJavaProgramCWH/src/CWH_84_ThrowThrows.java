public class CWH_84_ThrowThrows {
    public static void main(String[] args) {
        try{
//            int c = divide(12, 0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        } catch(Exception e){
            System.out.println("Exception");
        }

    }
    static int divide(int a, int b) throws ArithmeticException{
            return a / b;
    }

    public static double area(int r) throws NegativeRadiusException{
        if(r < 0) throw new NegativeRadiusException();
        return Math.PI * r * r;
    }
}


class NegativeRadiusException extends Exception{
    public String toString(){
        return "Negative radius exception.";
    }

    public String getMessage(){
        return "Radius can not be negative.";
    }
}