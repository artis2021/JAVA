package folder.folderl1.folderl2;

import java.sql.SQLOutput;

import static java.lang.Math.sin;

class Calculator{
    protected int num1 = 5;
        int b = 6;
    void calculate(int a, int b){
        System.out.println("The result is: "+ a+b);
    }
}

class ScCalculator{
    void calculate(int a, int b){
        System.out.println("The result is: "+ sin(a+b));
    }
}

class HyCalculator{
    void calculate(int a, int b){
        System.out.println("The result is: "+ a+b);
        System.out.println("The result is: "+ sin(a+b));
    }
}


public class CWH_68_PracticeSet2 {
    public static void main(String[] args) {
        
        System.out.println("I am the main method.");
    }
}
