import org.w3c.dom.ls.LSOutput;

public class CWH_39_PracticeSet {
    public static void main(String[] args) {
        Employee arti = new Employee();
//        arti.setName("Arti Sahu");
//        arti.salary = 59;
//        System.out.println(arti.getName());
//        System.out.println(arti.getSalary());
//        System.out.println(arti.name);
//        System.out.println(arti.salary);
//        CellPhone vivo = new CellPhone();
//        vivo.ringing();
//        vivo.vibrating();
        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}

class Square{
    int side;
    int area(){
        return side * side;
    }
    int perimeter(){
        return 4 * side;
    }

}

class CellPhone{
    void ringing(){
        System.out.println("Ringing...");
    }
    void vibrating(){
        System.out.println("Vibrating...");
    }

}

class Employee{
    int salary;
    String name;
    int getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }
     void setName(String name){
        this.name = name;
     }




}
