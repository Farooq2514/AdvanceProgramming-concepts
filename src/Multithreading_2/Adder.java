package Multithreading_2;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value value;
    public  Adder(Value value){
        this.value = value;
    }

    public Void call() throws Exception{
        for(int i = 1; i <= 100000 ; i++){
          //  System.out.println("Adder # "+i);
            value.setX(value.getX() +i);
        }
      return null;
    }
}
