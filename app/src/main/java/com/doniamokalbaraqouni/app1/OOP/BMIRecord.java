package com.doniamokalbaraqouni.app1.OOP;

public class BMIRecord {
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

}
