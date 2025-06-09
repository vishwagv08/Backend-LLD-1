 package org.example.L7_Concurrency;

public class NumberPrinter implements Runnable {

    public int i;

    NumberPrinter(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i + " " + Thread.currentThread().getName());
    }
}
