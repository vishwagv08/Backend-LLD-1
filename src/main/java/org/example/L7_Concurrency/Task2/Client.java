package org.example.L7_Concurrency.Task2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CustomInteger customInteger = new CustomInteger(0);

        Future<CustomInteger> adderOutput = executorService.submit(new Adder(customInteger));
        Future<CustomInteger> subOutput = executorService.submit(new Subtractor(customInteger));

        int a = adderOutput.get().getX();
        int b = subOutput.get().getX();

        System.out.println("Adder Output: "+ adderOutput.get() + " " + a);
        System.out.println("Subractor Output: "+ subOutput.get() + " " + b);

        System.out.println("Adder Output: "+ adderOutput.get() + " " + adderOutput.get().getX());
        System.out.println("Subractor Output: "+ subOutput.get() + " " + adderOutput.get().getX());

        // when loops for higher number of times, answer is not zero, because of concurrency issue



    }
}
