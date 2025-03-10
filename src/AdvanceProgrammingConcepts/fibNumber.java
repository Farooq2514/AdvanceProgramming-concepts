package AdvanceProgrammingConcepts;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class fibNumber implements Callable<Integer>{
    ExecutorService executorService;
    int n;

    fibNumber(int n, ExecutorService executorService) {
        this.n = n;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("calculate " + n +"th fibonacci number by the Thread : " + Thread.currentThread().getName());
        if (n <= 1) {
            return n;
        }
        Future<Integer> future1 = executorService.submit(new fibNumber(n - 1, executorService));
        Future<Integer> future2 = executorService.submit(new fibNumber(n - 2, executorService));
        int x = future1.get();
        int y = future2.get();
        return x + y;
    }
}

