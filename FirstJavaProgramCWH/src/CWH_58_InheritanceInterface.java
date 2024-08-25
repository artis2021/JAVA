public class CWH_58_InheritanceInterface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}

interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildInterface extends SampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements ChildInterface{
    public void meth3(){
        System.out.println("This is method 3.");
    }
    public void meth4(){
        System.out.println("This is method 4.");
    }
    public void meth1(){
        System.out.println("This is method 1.");
    }
    public void meth2(){
        System.out.println("This is method 2.");
    }

}

