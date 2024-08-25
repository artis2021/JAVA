public class CWH_70 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("This code is running in thread1.");
            System.out.println("I am very happy.");
        }
        
    }
}

class MyThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thread 2 is good.");
            System.out.println("I am very sad.");
        }

    }
}