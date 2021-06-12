package com.Study.ClassMethodAndObject;

class Methods {
    String animal;
    int value;
    int moth;
    void run(){
        System.out.println("Running");
        for(int i=0;i<3;i++){
            System.out.println("My "+ animal+ " is "+value+ " years old");
        }

    }

    int calculateMothsToBirthday(){
        int mothsLeft=12-moth;
        return mothsLeft;
    }

    void talk(String text){
        System.out.println(text);
    }

    void walk(int speed){
        System.out.println("Walking: "+speed+" km per hour");
    }

    void timer(int minutes,double second){
        System.out.println("It took "+ minutes+"m and "+ second+"s to get down the hill");
    }


}

public class Objects {
    public static void main(String[] args) {

        Methods name =new Methods();
        name.animal="Cat";
        name.value=10;
//        name.run();
        name.moth=3;
        int moths=name.calculateMothsToBirthday();
        System.out.println("Moths until birthday "+moths);

        name.talk("Hi everybody");
        name.walk(10);
        name.timer(10,10.3);

    }
}
