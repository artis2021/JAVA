public class CWH_60_PracticeSet {
    public static void main(String[] args) {
//        FountainPen fp = new FountainPen();
//        fp.write();
//        fp.refill();
//        fp.changeNib();

        Human arti = new Human();
        arti.eat();
        arti.bite();
    }
}

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void changeNib(){
        System.out.println("Changing Nib...");
    }

    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling...");
    }

}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }

}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}