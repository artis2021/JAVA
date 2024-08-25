public class CWH_48_MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.meth2();
    }
}

class A{
    void meth2(){
        System.out.println("I am method 2 of class A.");
    }
}

class B extends A{
    void meth2(){
        System.out.println("I am method 2 of class B.");
    }
}
