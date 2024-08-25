public class CWH_109_Lambda {
    public static void main(String[] args) {
//        AnnoyDemo obj = new AnnoyDemo() {
//            @Override
//            public void meth1() {
//                System.out.println("This is method 1.");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("This is method 2.");
//            }
//        };
//        obj.meth1();

//        AnnoyDemo obj = new NewClass();
//        obj.meth1();

        AnnoyDemo obj = () -> {
            System.out.println("I am method 1.");
        };
        obj.meth1();
    }
}

@FunctionalInterface
interface AnnoyDemo{
    public void meth1();
//    void meth2();
}

//class NewClass implements AnnoyDemo{
//    @Override
//    public void meth1(){
//        System.out.println("This is method 1 in NewClass.");
//    }
//}