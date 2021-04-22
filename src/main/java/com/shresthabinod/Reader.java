package com.shresthabinod;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {
    private String [] courses = {"Java", "Kotlin", "Swift", "Big Data"};
    private int count;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        System.out.println("Reading the file");
     if(count < courses.length){
         return courses[count++];
     } else {
         count = 0;
     }
        return null;
    }
}
