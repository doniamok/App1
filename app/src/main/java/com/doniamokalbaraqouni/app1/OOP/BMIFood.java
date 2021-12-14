package com.doniamokalbaraqouni.app1.OOP;

public class BMIFood {
    int img ;
    String name ;
    String category ;
    int calory;

    public BMIFood(int img,String name,String category,int calory){
    this.img=img ;
    this.name=name ;
    this.category=category ;
    this.calory=calory ;
    }

    public int getImg(){
        return  img ;
    }
    public void setImg(int img){
        this.img=img ;
    }
    public  String getName(){
    return  name ;
    }
    public void setName(String name){
    this.name=name ;
    }
    public String getCategory(){
    return category ;
    }
    public void setCategory(String category){
    this.category=category ;
    }
    public int getCalory(){
    return calory ;
    }
    public void setCalory(int calory){
    this.calory=calory ;
    }
    }
