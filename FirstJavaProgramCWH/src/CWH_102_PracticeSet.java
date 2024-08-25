import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWH_102_PracticeSet {
    public static void main(String[] args) {
//        ArrayList arr = new ArrayList();
//        arr.add("Stu 1");
//        arr.add("Stu 1");
//        arr.add("Stu 1");
//        arr.add("Stu 1");
//        arr.add("Stu 1");
//        arr.add("Stu 1");
//        for(Object o: arr){
//            System.out.println(o);
//        }
//        System.out.println(arr);
//        System.out.println(arr[0]);

//        HashSet<Integer> st = new HashSet<>();
//        st.add(7);
//        st.add(73);
//        st.add(7);
//        st.add(790);
//        st.add(778);
//        System.out.println(st);
//        for(Integer o: st){
//            System.out.println(o);
//        }

//        Date d = new Date();
//        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
//        int a = 10;
//        int b = 10;
//        int e = 10;
//        int f = 10;
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dtf.format(ldt);
        System.out.println(myDate);

    }
}
