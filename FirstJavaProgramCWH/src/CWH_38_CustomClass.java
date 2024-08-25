public class CWH_38_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 arti = new Employee1();
        arti.id = 1;
        arti.name = "Arti Sahu";
        arti.salary = 20;
        Employee1 suraj = new Employee1();
        suraj.id = 5;
        suraj.name = "Suraj Sahu";
        suraj.salary = 34;
//        System.out.println("id: " + arti.id + " name: " + arti.name);
        arti.printDetails();
        suraj.printDetails();
        System.out.println(arti.getSalary());
        System.out.println(suraj.getSalary());
    }


}

class Employee1{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
    }
    int getSalary(){
        return salary;
    }

}
