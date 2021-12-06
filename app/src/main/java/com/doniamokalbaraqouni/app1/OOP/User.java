package com.doniamokalbaraqouni.app1.OOP;

import java.util.ArrayList;

public class User {
    private ArrayList<BMIRecord> records ;
    
    public User() {
        this.records = new ArrayList<BMIRecord>();
        records.add(new BMIRecord("1/12/2021", 70, 161));
        records.add(new BMIRecord("2/12/2021", 70, 161));
        records.add(new BMIRecord("3/12/2021", 69, 161));
        records.add(new BMIRecord("30/11/2021", 70, 161));
    }
        public ArrayList<BMIRecord>getRecords() {
            return records;
        }
}

