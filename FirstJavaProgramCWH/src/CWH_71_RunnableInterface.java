public class CWH_71_RunnableInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i < 1000){
            i++;
            System.out.println("I am thread 1.");
        }

    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){int i = 0;
        while(i < 1000){
            i++;
            System.out.println("I am thread 2.");
        }
    }
}

