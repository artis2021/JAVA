import org.w3c.dom.ls.LSOutput;

public class CWH_55_Interface {
    public static void main(String[] args) {
        Hero h = new Hero();
//        h.a = 60;
        h.applyBreak(5);
        h.blowHorn();
        h.speedUp(6);
    }
}

interface Bicycle{
    final int a = 50;
    void applyBreak(int dec);
    void speedUp(int inc);
}

class Hero implements Bicycle{
    public void applyBreak(int dec){
        System.out.println("Break...");
    }

    public void speedUp(int inc){
        System.out.println("SpeedUp...");
    }

    void blowHorn(){
        System.out.println("Blowing Horn...");
    }
}