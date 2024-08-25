public class CWH_44_PracticeSet {
    public static void main(String[] args) {
        Cylinder indane = new Cylinder(7, 10);
        indane.setHeight(10);
        indane.setRadius(7);
        System.out.println(indane.getHeight());
        System.out.println(indane.getRadius());
        System.out.println(indane.surfaceArea());
        System.out.println(indane.volume());
    }
}

class Cylinder{
    private int radius, height;

    Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    int surfaceArea(){ return 2* 22/7* radius * height;}
    int volume(){ return 22/7 * radius *radius *height;}

}