public class CWH_42_Contructor {
    public static void main(String[] args) {
        MyMainEmployee arti = new MyMainEmployee();
        arti.getDetails();
        arti.setId(12);
        arti.setName("Arti Sahu");
        arti.getDetails();
    }
}

class MyMainEmployee{
    int id;
    String name;
    MyMainEmployee(){
        this.name = "Your name";
        this.id = 15;
        System.out.println("This: "+ this);
    }

    void setId(int id){ this.id = id;}
    void setName(String name){ this.name = name;}

    void getDetails(){
        System.out.println(name);
        System.out.println(id);
    }



}
