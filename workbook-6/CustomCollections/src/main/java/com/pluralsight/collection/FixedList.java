package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    private List<T> items ;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();

    }
    public List<T> getItems() {
        return items;
    }

    public void add(T item){
        if(items.size() < maxSize){
            items.add(item);
        }else {
            throw new IllegalStateException("Maximum numbers exceeded!");
        }
//        maxSize = item;
    }

}
