package com.doniamokalbaraqouni.app1.OOP;

import com.google.firebase.database.core.Constants;


public class BMIRecord {
    public int getMessage() {

        return 0;
    }

    private static class Constants {
        final static String Underweight = "Underweight";
        final static String Healthy = "Healthy";
        final static String Overweight = "Overweight";
        final static String Obesity = "Obesity";
        final static String LC = "Little Changes";
        final static String SG = "Still Good";
        final static String GA = "Go Ahead";
        final static String BC = "Be Careful";
        final static String SB = "So Bad";
    }

    private String date;
    private double weight;
    private int length;
    private String id;

    public BMIRecord() {

    }

    public BMIRecord(double weight, int length, String date) {
        this.weight = weight;
        this.length = length;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public double getBMI() {
        return (weight / Math.pow((length / 100.0), 2)) * this.getAgePercent();
    }

    public void setBMI(double v) {

    }

    public double getAgePercent() {
        return 1;
    }

    public void setAgePercent(double v) {

    }

    public String getBMIMessage() {
        double bmi = this.getBMI();
        if (bmi < 18.5) {
            return Constants.Underweight;
        } else if (18.5 <= bmi && bmi < 25) {
            return Constants.Healthy;
        } else if (25 <= bmi && bmi < 30) {
            return Constants.Overweight;
        } else if (30 < bmi) {
            return Constants.Obesity;
        }
        return null;
    }




}
/**before firebase**/
/**public class BMIRecord {
    String date;
    String message ;
    int weight;
    int length;

    public BMIRecord(int weight, int length, String date, String message) {
        this.weight = weight;
        this.length = length;
        this.date = date;
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}**/


