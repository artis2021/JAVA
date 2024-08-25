import java.util.*;

public class CWH_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(5);
//        System.out.println(arr1.add(3));
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(7);
        arr1.add(8);
        arr2.add(31);
        arr2.add(37);

        arr1.add(1, 40);
//        arr1.toArray();
//        arr1.
        arr1.addAll(arr2);
//        arr1.clear();
        System.out.println(arr1.contains(37));
        arr1.remove(1);
        arr1.set(1, 60);
        for(int i = 0; i < arr1.size(); i++){
            System.out.println(arr1.get(i));
//            System.out.println(arr1[i]);
        }
        System.out.println(arr1.indexOf(37));




    }
}
