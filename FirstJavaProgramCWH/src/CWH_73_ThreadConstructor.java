public class CWH_73_ThreadConstructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Arti");
        t.start();
        System.out.println("The id of the thread is "+ t.getId());
        System.out.println("The name of this thread is "+ t.getName());
        System.out.println(t.threadId());
        System.out.println(t.getPriority());
        System.out.println(t.getContextClassLoader());
        System.out.println(t.getStackTrace());
        System.out.println(t.getThreadGroup());;
        System.out.println(t.getState());
        System.out.println(t.getUncaughtExceptionHandler());
        System.out.println(t.isAlive());
        System.out.println(t.isInterrupted());
        t.setPriority(1);
        System.out.println(t.getPriority());
    }
}

class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }

    public void run(){
//        while(true){
//            System.out.println("I am a thread.");
//        }
    }
}