package calc;

import java.sql.SQLOutput;

import static java.lang.Math.sin;

class Calculator{
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


public class CWH_68_PracticeSet {
    public static void main(String[] args) {
        System.out.println("I am the main method.");
    }
}
