public class CWH_40_ClassAccessModifier {
    public static void main(String[] args) {
        MyEmployee arti = new MyEmployee();
//        arti.name = "Arti Sahu";
//        arti.id = 5;

    }
}

class MyEmployee{
    private String name;
    private int id;
    String getName(){
        System.out.println(this);
        return name;
    }
    int getId(){
        return id;
    }

    void setName(String name){
        this.name = name;
    }

    void setId(int id){
        this.id = id;
    }





}
