import java.util.Scanner;

import static java.util.Collections.swap;

public class CWH_29_Practice {
    public static void main(String[] args) {
        float [] arr = new float[5];
        Scanner sc = new Scanner(System.in);
//        float sum = 0;
//        System.out.print("Enter a number to find in an array: ");
//        float num = sc.nextFloat();
        System.out.println("Enter the num one by one.");
        float maxi = -1e9f, mini = -1e9f;
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextFloat();
//            sum += arr[i];
//            if(arr[i] == num){
//                System.out.println("Yes the number is present in the array.");
//                return;
//            maxi = Float.max(maxi, arr[i]);
//            mini = Float.min(mini, arr[i]);
            if(mini > arr[i]){
                System.out.println("Array is not sorted.");
                return;
            }
            mini = arr[i];
            }
        System.out.println("Yes the array is sorted.");
//        System.out.println("The max element is: "+ maxi);
//        System.out.println("The min element is: "+ mini);

//        System.out.println("Sorry, your number is not present in an array.");
//        System.out.println(sum);
//    for(int i = 0, j = arr.length -1; i < j; i++, j--){
////        swap(arr, arr[i], arr[j]);
//        float a = arr[i];
//        arr[i] = arr[j];
//        arr[j] = a;
//
//    }
//    for(float ele: arr){
//        System.out.println(ele);
//    }

}

//    private static void swap(float v, float v1) {
    }
