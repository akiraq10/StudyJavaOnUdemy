package com.Study.OOPs.Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        Computer computer1=new Computer();
        computer1.start();

        Vehicle vehicle1=new Vehicle("Car");
        vehicle1.drive();

        Information info= new Computer();
        info.displayInformation();

        Information info1=vehicle1;
        info.displayInformation();

        showInformation(computer1);
        showInformation(vehicle1);
    }
    private static void showInformation(Information info){
        info.displayInformation();
    }
}
