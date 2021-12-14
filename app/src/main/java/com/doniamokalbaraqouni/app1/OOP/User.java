package com.doniamokalbaraqouni.app1.OOP;

import com.doniamokalbaraqouni.app1.R;

import java.util.ArrayList;

public class User {
    private ArrayList<BMIRecord> records ;
    private ArrayList<BMIFood> foods  ;

    public User() {
        this.records = new ArrayList<BMIRecord>();
        records.add(new BMIRecord(80, 170, "9/12/2021", "Normal"));
        records.add(new BMIRecord(70, 190, "9/1/2021", "Normal"));
        records.add(new BMIRecord(50, 150, "1/5/2021", "Normal"));
        this.foods= new ArrayList<BMIFood>() ;
        foods.add(new BMIFood(R.drawable.salamon,"Salamon","Fish",22)) ;
        foods.add(new BMIFood(R.drawable.rais,"Rais","Carbohydrates",30)) ;
        foods.add(new BMIFood(R.drawable.banana,"Banana","Fruit",2)) ;
        foods.add(new BMIFood(R.drawable.apple,"Apple","Fruit",4)) ;
        foods.add(new BMIFood(R.drawable.orange,"Orange","Fruit",2)) ;
    }


        public ArrayList<BMIRecord>getRecords() {
            return records;
        }
        public ArrayList<BMIFood>getFoods(){return foods ;}

}

