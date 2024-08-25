public class CWH_46_Contructors {
    public static void main(String[] args) {
//        Base1 b = new Base1();
        Derived1 d = new Derived1();
    }
}

class Base1{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Base1(){
        System.out.println(this);
        System.out.println("I am Base Class Constructor.");
    }

    Base1(int x){
        System.out.println(this);
        System.out.println("I am a overloaded constructor with value is: "+ x);
    }

}

class Derived1 extends Base1{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Derived1(){
        super(5);
//        super();
//        System.out.println(super());
        System.out.println(this);
        System.out.println("I am derived class constructor.");
    }

}
