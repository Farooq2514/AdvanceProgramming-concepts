package AdvanceProgrammingConcepts;

public class helloWorld implements Runnable {
    public void print(){
        System.out.println("hello world "+Thread.currentThread().getName() );
    }
    public void run(){
        print();
    }
}
