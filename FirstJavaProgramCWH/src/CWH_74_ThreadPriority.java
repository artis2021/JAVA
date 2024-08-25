public class CWH_74_ThreadPriority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("arti1");
        MyThr1 t2 = new MyThr1("arti2");
        MyThr1 t3 = new MyThr1("arti3");
        MyThr1 t4 = new MyThr1("arti4");
        MyThr1 t5 = new MyThr1("arti5 (most important)");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());
        System.out.println(t5.getPriority());
//        t5.setPriority(10);
        t5.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t5.getPriority());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}

class MyThr1 extends Thread{
    MyThr1(String name){
        super(name);
    }

    public void run(){
        while(true){
            System.out.println("This is Thread "+ this.getName());
        }

    }

}