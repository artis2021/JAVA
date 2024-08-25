public class CWH_76_PracticeSet {
    public static void main(String[] args) {
        Hello t1 = new Hello();
        Morning t2 = new Morning();
//        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());

    }
}

class Hello extends Thread{
    public void run(){
//        while(true){
//            try{
//                Thread.sleep(200);
//            } catch(Exception e){
//                System.out.println(e);
//            }

            System.out.println("Hello Hiii...");
//        }

    }
}

class Morning extends Thread{
    public void run(){

//        while(true){
//            try{
//                Thread.sleep(200);
//            } catch(Exception e){
//                System.out.println(e);
//            }

            System.out.println("Good Morning.");
//        }

    }
}