public class CWH_49_DynamicMethodDispatch {
    public static void main(String[] args) {
        Two t = new Two();
        t.name();
    }
}

class  One{
    void name(){
        System.out.println("My name is Arti.");
    }
}

class Two extends One{
    void name(){
        System.out.println("My name is Arti in class two.");
    }
}