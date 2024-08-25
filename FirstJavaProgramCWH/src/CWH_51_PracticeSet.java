public class CWH_51_PracticeSet {
    public static void main(String[] args) {
        Cylinder2 c = new Cylinder2(7, 10);
        c.printDetails();
        System.out.println(c.area());
        System.out.println(c.volume());

    }
}

class Circle{
    int radius;
    Circle(int radius){
        System.out.println("I am circle constructor.");
        this.radius = radius;
    }

    Circle(){
        System.out.println("I am by default constructor.");
    }

    double area(){
        return Math.PI * radius * radius;
    }
}

class Cylinder2 extends Circle{
    int height;
    Cylinder2(int radius, int height){
        super(radius);
        System.out.println("I am cylinder constructor.");
        this.height = height;
    }

    void printDetails(){
        System.out.println(radius);
        System.out.println(height);
    }

    double volume(){
        return Math.PI * radius *radius * height;
    }
}
