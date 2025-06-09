package org.example.L7_Concurrency.Task2;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<CustomInteger> {

    CustomInteger customInteger;

    public Subtractor(CustomInteger customInteger) {
        this.customInteger = customInteger;
    }

    public CustomInteger subtractI() {
        for (int j =0; j < 10000; j++) {
            customInteger.setX(customInteger.getX() - j);
        }
        return customInteger;
    }

    @Override
    public CustomInteger call() throws Exception {
        return subtractI();
    }
}
