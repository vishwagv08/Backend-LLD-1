package org.example.L6_Concruency1;

public class SyncPrinter implements Runnable {

    public synchronized void summa() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello World Printer" + " " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        summa();
    }
}
