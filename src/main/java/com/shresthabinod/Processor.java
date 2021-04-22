package com.shresthabinod;

import org.springframework.batch.item.ItemProcessor;

import java.util.Locale;

public class Processor implements ItemProcessor<String, String> {
    @Override
    public String process(String item) throws Exception {
        System.out.println("Inside Process");
        return "Processed "+ item.toUpperCase();
    }
}
