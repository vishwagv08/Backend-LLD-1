package org.example.L7_Concurrency.Task2;

import lombok.Getter;
import lombok.Setter;

public class CustomInteger {

    @Getter
    @Setter
    private int x;

    public CustomInteger(int x) {
        this.x = x;
    }
}
