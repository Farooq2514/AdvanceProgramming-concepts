package LamdaStreamandException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaClient {
    public static void main(String[] args) {


        //Defining the lamda using Runnable;
        //hew () we dont need to pass any type of the arguments because it automatically identify the refer
        // it is going to implement the functions which have only one method to implement for the interface for that type
        //we are using the Lamda

        //Receipe
        //Because we are implementing the runnable object

        Runnable runnable = ()->{
            System.out.println("Hello World");
        };
        //Actual kitchen where the execution happens
        Thread thread = new Thread(runnable);
        thread.start();

        //we can directly add these things
        //Because we are implementing the runnable object
        //Amd we store something that we need to use to in further here we dont want to use just print here
        Thread t1 = new Thread (() -> {
            System.out.println("Hello World Again");
        });
        t1.start();

        //With Callable
        Callable<Integer>callable = ()->{
            return 5+4;
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer>future = executorService.submit(callable);
        try {
            Integer result = future.get();
            System.out.println(result);
        }catch (Exception e){
            System.out.println("this is message"+e.getMessage());
        }
        //odd printer
        ArrayList<Integer> oddlist = new ArrayList<>();
        oddlist.add(1);
        oddlist.add(2);
        oddlist.add(3);
        oddlist.add(4);
        oddlist.add(5);
        oddlist.add(6);
        Collections.sort(oddlist ,(arg1 , arg2) ->{
          if(arg1 %2 != 0){
              return -1;
          }else if(arg1 %2 == 0){
              return 1;
          }else{
              return 0;
          }

        });
        System.out.println(oddlist);

        ArrayList<Integer> Evenlist = new ArrayList<>();
        Evenlist.add(1);
        Evenlist.add(2);
        Evenlist.add(3);
        Evenlist.add(4);
        Evenlist.add(5);
        Evenlist.add(6);
        Collections.sort(Evenlist ,(a , b) ->{
            if(a %2 == 0){
                return a-b;
            }else if(b %2 != 0){
                return b-a;
            }else{
                return 0;
            }

        });
        System.out.println(Evenlist);

    }
}
/*
//previously we have created a separate class for printing the hello world and implemented the runnable method
where for the writing the one instance ,
so there is a new way and shorter way to write a instruction in shorter way for the exection of the program

with Runnable: () -> { } works because Java knows:
Runnable has only one method (run)
run() takes no parameters
That's why we can skip parameter types.

***********
Lambda only works with Functional Interfaces (interfaces with just one abstract method). Common examples:
Functional interfaces :- the interface with a single method is called functional interfaces
Runnable (run)
Predicate (test)
Function (apply)
* */

