import java.util.LinkedList;

public class CWH_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(1);
        l1.add(14);
        l1.add(31);
        l1.add(61);
        l1.add(18);
        l1.add(14);
        l2.add(89);
        l2.add(69);
        l2.add(39);
        l1.addFirst(99);
        l1.addLast(456);
        l1.addAll(l2);
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
