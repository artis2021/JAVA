public class CWH_103_Ex6Sol {
    public static void main(String[] args) throws InvlidInputException, CannotDivideByZeroException, MaxInputException{
        CustomCalculator c = new CustomCalculator();
//        c.add(8, 9);
//        c.div(8, 0);
        c.add(1000000080, 1);
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvlidInputException, MaxInputException{
        if(a > 100000000 || b > 100000000){
            throw new MaxInputException();
        }
        if(a == 8 || b == 9){
            throw new InvlidInputException();
        }
        return a + b;
    }
    double sub(double a, double b){
        return a - b;
    }
    double mul(double a, double b){
        return a * b;
    }
    double div(double a, double b) throws CannotDivideByZeroException{
        if(b == 0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Can not divide by 0.";
    }
}

class InvlidInputException extends Exception{
    public String toString(){
        return "Can not add 8 and 9.";
    }
}

class MaxInputException extends Exception{
    public String toString(){
        return "Max input exception this is.";
    }
}