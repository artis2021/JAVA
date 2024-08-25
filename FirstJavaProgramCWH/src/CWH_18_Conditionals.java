import java.util.Scanner;

public class CWH_18_Conditionals {
    public static void main(String[] args) {
//        int age = 36;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter your age: ");
//        int age = sc.nextInt();
//        if(age > 50){
//            System.out.println("You are a experienced person.");
//        } else if(age > 40){
//            System.out.println("You are semi experienced person.");
//        } else if(age > 30){
//            System.out.println("You are intern level experienced person.");
//        }else{
//            System.out.println("No, you are not a experienced person.");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("lease enter your age: ");
        int age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You are a teenager.");
                break;
            case 30:
                System.out.println("You may be working man.");
                break;
            case 40:
                System.out.println("Congratulations, you will marry soon.");
                break;
            case 60:
                System.out.println("Enjoy your married life.");
                break;
            default:
                System.out.println("You don't fall in any category.");
        }


    }
}
