package org.example.L6_Concurrency;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello World Printer" + Thread.currentThread().getName());
    }
}
