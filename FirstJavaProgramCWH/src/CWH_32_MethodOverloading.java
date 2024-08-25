public class CWH_32_MethodOverloading {
     static void joke(){
        System.out.println("I invented the Plagerism word.");
    }
    static void change(int [] arr){
         arr[0] = 100;
    }

    static int sum(int ...arr){
         int ans = 0;
         for(int ele: arr){
             ans += ele;
         }
         return ans;
    }


    public static void main(String[] args) {
//         CWH_32_MethodOverloading obj = new CWH_32_MethodOverloading();
//        obj.joke();
//        joke();
//        int [] arr = {99, 98, 65, 89, 43};
//        change(arr);
//        System.out.println(arr[0]);

        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 7));
        System.out.println(sum(2, 3, 7, 11));
        System.out.println(sum(2, 3, 7, 11, 78));
        System.out.println(sum(2, 3, 7, 22, 78, 54));
    }


}
