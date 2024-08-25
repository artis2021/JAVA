package CWH_77_PracticeSet;

public class Sphere extends Shape {
    Sphere(int dim1){
        super(dim1, -1);
    }

    double area(){
        return 4 * Math.PI * dim1 * dim1;
    }

    double volume(){
        return 4/3 * Math.PI * dim1 * dim1 *dim1;
    }
}
