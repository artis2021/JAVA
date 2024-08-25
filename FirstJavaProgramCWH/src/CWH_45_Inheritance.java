public class CWH_45_Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(10);
        System.out.println(d.getX());
    }
}

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
