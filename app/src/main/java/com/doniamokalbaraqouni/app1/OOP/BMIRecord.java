package com.doniamokalbaraqouni.app1.OOP;

public class BMIRecord {
    String date;
    String message ;
    int weight;
    int length;

    public BMIRecord(String date , int weight , int length){
        this.date = date ;
        this.weight = weight ;
        this.length = length  ;
    }
    public String getDate(){
        return date ;
    }
    public void setDate(String date){
        this.date = date ;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public void setLength(int length){this.length=length ;}
    public int getLength(){return length ;}
    public String getBmiMessage(){
        return message ;
    }
}
