package CWH_77_PracticeSet;

public class Rectangle extends Shape{
    Rectangle(int dim1, int dim2){
        super(dim1, dim2);
    }

    int area(){
        return dim1 * dim2;
    }
}
