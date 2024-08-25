public class CWH_53_Abstract {
    public static void main(String[] args) {
//        Base2 b = new Base2();

    }
}

abstract class Base2{
    Base2(){
        System.out.println("I am base2 constructor");
    }
    void sayHello(){
        System.out.println("Hello");
    }

    abstract void greet();
}

class Derived2 extends Base2{
    void greet(){
        System.out.println("Good Morning.");
    }

}

