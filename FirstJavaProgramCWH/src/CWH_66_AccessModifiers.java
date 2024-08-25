public class CWH_66_AccessModifiers {
    public static void main(String[] args) {
//        C1 obj1 = new C1();
//        obj1.meth1();
//        System.out.println(obj1.x);
//        System.out.println(obj1.y);
//        System.out.println(obj1.z);
//        System.out.println(obj1.a);
        C2 obj2 = new C2();
        obj2.meth2();

    }
}

class C1{
    public int x = 5;
    protected int y = 10;
    int z = 12;
    private int a = 34;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class C2 extends C1{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        System.out.println(a);
    }
}
