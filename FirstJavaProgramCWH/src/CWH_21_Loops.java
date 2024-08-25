import java.util.Scanner;

public class CWH_21_Loops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number to generate a table: ");
//        int num = sc.nextInt();
//        int i = 1;
//        while(i <= 10){
//            System.out.print(num * i++ + " ");
//
//        }
//
//        int a = 0;
//        do{
//            System.out.println(a++);
//        } while(a < 5);

//        for(int i = 0; i <= 10; i++){
//            if(i % 2 == 0)
//            System.out.println(i);
//        }

        for(int i = 0; i <= 5; i++){

            if(i == 3){
//                System.out.println("Loops is about to end at "+ i);
//                break;
                continue;
            }
            System.out.println("This is %d loop "+ i);
        }
    }
}
