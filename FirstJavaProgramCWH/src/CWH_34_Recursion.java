public class CWH_34_Recursion {
    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void fibonacciSeries(int n){
        int a = 0, b = 1;
        System.out.println(a);
        if(n == 1){

            return;
        }
        System.out.println(b);
        if(n == 2){

            return;
        }
        for(int i = 3; i <= n; i++){
            int sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }


    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(factorial(31));
        fibonacciSeries(40);
    }
}
