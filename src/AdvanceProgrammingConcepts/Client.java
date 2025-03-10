package AdvanceProgrammingConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args)throws Exception {
        //Created a runnable instance because label it that this is a runnable class
        //we can use directly like Thread t = new Thread (new helloWorld) , but it is not much reusable and not
        //good readable so that creating with the instance of the runnable is preferred
        Runnable runnable1 = new helloWorld();
        System.out.println("This is main thread and Running in : "+ Thread.currentThread().getName());
        //Creating a thread here
        Thread t1 = new Thread(runnable1);
        //Starting a Thread
        t1.start();


        //printing the sum from 1 to 100
        Runnable runnable  = new printSum(100);
        Thread t2 = new Thread(runnable);
        t2.start();

        //Printing number from 1 to input
        int input = 10;
        for(int i = 1 ; i <= input ; i++){
            Runnable r2 = new numberPrinter(i);
            Thread t3 = new Thread(r2);
            t3.start();
        }

        //Running tasks by creating  a executors
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 1 ; i <= input ; i++){
            executorService.execute(new numberPrinter(i));
        }
        ExecutorService fibservice = Executors.newCachedThreadPool();
        Future<Integer>ansFuture = fibservice.submit(new fibNumber(3 , fibservice));
       try{
           int ans = ansFuture.get();
           System.out.println("Ans "+ans);
       }
        catch (Exception e){

        }

    }
}
