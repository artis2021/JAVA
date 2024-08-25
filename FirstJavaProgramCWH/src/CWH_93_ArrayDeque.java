import java.util.ArrayDeque;

public class CWH_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr1 = new ArrayDeque<>();
        arr1.add(3);
        arr1.add(33);
        arr1.add(39);
        arr1.addFirst(45);
        arr1.addLast(67);
//        arr1.removeFirst();
        arr1.removeLast();
//        for(int i =
        System.out.println(arr1.getFirst());
        System.out.println(arr1.getLast());
    }
}
