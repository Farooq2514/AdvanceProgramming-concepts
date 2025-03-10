package AdvanceProgrammingConcepts;

public class numberPrinter implements Runnable{
    int input;
    numberPrinter(int input){
        this.input = input;
    }

      public void run(){
          System.out.println(input +" Thread "+ Thread.currentThread().getName());
        }
    }

