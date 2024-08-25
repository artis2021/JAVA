import java.util.Scanner;

public class CWH_26_Arrays {
    public static void main(String[] args) {
//        int [] arr = new int[5];
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0; i < 5; i++){
//            int a = sc.nextInt();
//            arr[i] = a;
////            System.out.println(arr);
//        }
//        for(int i = 0; i < 5; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("Size of arr is: "+ arr.length);

//        float [] arr = {99, 99,99, 91, 89, 78};
//        System.out.println(arr.length);
//        System.out.println(arr[0]);
//        String []names = {"Arti", "Atharv", "Anaya"};
//        System.out.println(names[0].length());
//        for(int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
//        for(String ele: names){
//            System.out.println(ele);
//        }

        int [][] flats;
        flats = new int[2][3];
        flats[0][0] = 0;
        flats[0][1] = 1;
        flats[0][2] = 2;
        flats[1][0] = 3;
        flats[1][1] = 4;
        flats[1][2] = 5;
        for(int i = 0; i < flats.length; i++){
            for(int j = 0; j < flats[i].length; j++){
                System.out.println(flats[i][j]);
            }
        }
    }
}
