package org.example.L9_Concurrency_Semaphores.ProducerConsumer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Store {

    private int maxSize;
    private List<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        items = new ArrayList<>(this.maxSize);
    }

    public void addItem(Object item) {
        items.add(item);
        System.out.println("Producer is producing the items: " + items.size());
    }

    public void removeItem() {
        items.removeLast();
        System.out.println("Consumer is removing the item: " + items.size());
    }
}
