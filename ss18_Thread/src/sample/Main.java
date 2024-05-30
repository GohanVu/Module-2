package sample;

 class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running...!");
    }
}
class MyRunnable implements Runnable{
     public void run(){
         System.out.println("Thread is running...!!!");
     }
}
public class Main{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
    }
}
