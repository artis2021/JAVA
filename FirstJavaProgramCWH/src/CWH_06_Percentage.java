import java.util.Scanner;

public class CWH_06_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st sub marks: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter your 2nd sub marks: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter your 3rd sub marks: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter your 4rth sub marks: ");
        int sub4 = sc.nextInt();
        System.out.print("Enter your 5th sub marks: ");
        int sub5 = sc.nextInt();
        float ans = (sub1 + sub2 + sub3 + sub4 +sub5) / 5f;
        System.out.println("Your percentage is: "+ ans);
    }
}
