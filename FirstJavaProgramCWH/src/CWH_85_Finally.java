public class CWH_85_Finally {
    static int greet(){
        try{
            int a = 10;
            int b = 0;
            int c = a / b;
            return c;
        } catch(Exception e){
            System.out.println(e);
        } finally{
            System.out.println("This is end of the function.");
        }
        return 0;
    }

    public static void main(String[] args) {
//        int k = greet();
//        System.out.println(k);
        int a = 10;
        int b = 5;
        while(true){
            try{
                System.out.println(a / b);
            } catch(Exception e){
                System.out.println(e);
                break;
            } finally{
                System.out.println("The value of b is: "+ b);
            }
            b--;
        }
    }
}
