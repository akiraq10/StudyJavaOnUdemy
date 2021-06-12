package com.Study.OOPs.Interfaces;

public class Computer implements Information {

    private int serialNumber=3833;
    public void start(){
        System.out.println("Computer is started!");
    }

//    @Override
    public void displayInformation() {
        System.out.println("Computer serialnumber: "+ serialNumber);
    }
}
