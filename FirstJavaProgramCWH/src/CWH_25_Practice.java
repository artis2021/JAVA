public class CWH_25_Practice {
    public static void main(String[] args) {
//        for(int i = 4; i >= 1; i--){
//            for( int j = 0; j < i; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }

        int n = 10;
        int i = 0;
        int sum = 0;
        while(i <= n){
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}
