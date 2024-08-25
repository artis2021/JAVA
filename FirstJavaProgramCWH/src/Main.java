//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello world");

        int a = 10, b = 20, c = 30;
        int d = add(a, b, c);
        System.out.println(d);




    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }
}