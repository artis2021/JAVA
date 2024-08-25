package CWH_77_PracticeSet;

public class Square extends Shape {
    Square(int dim1){
        super(dim1, -1);
    }

    int area(){
        return dim1 * dim1;
    }
}
