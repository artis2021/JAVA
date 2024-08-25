import java.util.ArrayList;

public class CWH_110_Generics {
    public static void main(String[] args) {
//        ArrayList arr = new ArrayList();
//        arr.add(67);
//        arr.add(6755);
//        arr.add("Arti");
//        int a = (int)arr.get(1);
//        System.out.println(a);

        Generic obj = new Generic(5, "Arti");
        System.out.println(obj.getVal());
        System.out.println(obj.gett1());
        Generic obj2 = new Generic(5, 9.88);
        System.out.println(obj2.gett1());
    }
}

class Generic<T1>{
    int val;
    T1 t1;
    Generic(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
        System.out.println("The type of T1 is " + t1.getClass().getName());
    }

    int getVal(){
        return val;
    }

    T1 gett1(){
        return t1;
    }

    void setVal(int val){
        this.val = val;
    }

    void sett1(T1 t1){
        this.t1 = t1;
    }

}
