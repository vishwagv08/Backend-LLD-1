package org.example.L6_Concurrency;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();

        // Untill t1 completed current thread will not proceed
        t1.join();

//        Thread.sleep(1000);
        System.out.println("Hello World Printer" + Thread.currentThread().getName());

        Thread t2 = new  Thread(new SyncPrinter());
        t2.setName("SyncPrinter-1");
        Thread t3 = new  Thread(new SyncPrinter());
        t3.setName("SyncPrinter-2");

        t2.start();
        t3.start(); // when t2 is running t3 will be in blocked status as both are call synchronised method

        t3.join();
//        ------------------------------------
        for (int i =0; i < 10; i++) {
            Thread t4 = new Thread(new NumberPrinter(i));
            t4.start();
        }
    }
}
