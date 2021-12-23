package com.doniamokalbaraqouni.app1.OOP;

public class BMIFood {
   private  int img ;
   private  String name ;
    private  String category ;
    private  int calory;
    private String id ;

    public BMIFood(int img,String name,String category,int calory){
    this.img=img ;
    this.name=name ;
    this.category=category ;
    this.calory=calory ;
    }

    public  int getImg(){
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
    public  String getCategory(){
    return category ;
    }
    public void setCategory(String category){
    this.category=category ;
    }
    public  int getCalory(){
    return calory ;
    }
    public void setCalory(int calory){
    this.calory=calory ;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    }
