package CWH_77_PracticeSet;

public class Cylinder extends Shape {
    Cylinder(int dim1, int dim2){
        super(dim1, dim2);
    }

    double area(){
        return 2 * Math.PI * dim1 *dim2 + 2 * Math.PI * dim1 *dim1;
    }

    double volume(){
        return Math.PI * dim1 * dim1 *dim2;
    }
}
