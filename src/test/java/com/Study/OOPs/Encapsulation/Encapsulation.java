package com.Study.OOPs.Encapsulation;
class Car{
    public static final int speed=299;
    private String type;

    public String getType() {
        return type;
    }

    public String getRevenue(){
        String data="Revenue: "+ calculateRevenue();
        return data;
    }
    private int calculateRevenue(){
        return 12000;
    }

    public void setType(String type) {
        this.type = type;
    }
}
public class Encapsulation {
    public static void main(String[] args) {

    }
}
