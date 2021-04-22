package com.shresthabinod;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class Writer implements ItemWriter<String> {
    @Override
    public void write(List<? extends String> items) throws Exception {
        System.out.println("Inside Writer");
        System.out.println("Writing Data: " + items);
    }
}
