package org.example.L7_Concurrency;

import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

        Thread.sleep(5000);
        System.out.println("-----------------");
        ExecutorService executorService1 = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService1.execute(numberPrinter);
        }

        Thread.sleep(5000);
        System.out.println("-----------------");
        Future<?> op =  executorService1.submit(new NumberPrinter(8888));
        if (op.get() == null){
            System.out.println("Runnable can also be called from submit, " +
                    "and op.get will make the main calling thread wait");
        }
    }
}
