package AdvanceProgrammingConcepts;

public class printSum implements Runnable{
    int input;
    printSum(int input){
        this.input = input;
    }
    public void sum(){
        int sum = 0 ;
        for(int i = 1 ; i <= input ; i++){
            sum = sum + i;
        }

        System.out.println(sum + " is the sum executing in Thread : "+Thread.currentThread().getName());
    }


    @Override
    public void run() {
        sum();
    }
}
