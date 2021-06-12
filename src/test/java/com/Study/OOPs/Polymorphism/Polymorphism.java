package com.Study.OOPs.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        Vehicle vehicle1=new Vehicle();
        Car car1=new Car();

        Vehicle vehicle2=car1;

        vehicle2.design();
        car1.ride();
        createDesign(car1);

    }

    public static void createDesign(Vehicle vehicle){
        vehicle.design();

    }
}
