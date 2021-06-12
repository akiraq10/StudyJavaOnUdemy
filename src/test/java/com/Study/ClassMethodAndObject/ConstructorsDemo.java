package com.Study.ClassMethodAndObject;
class Program{
    int value;
    String text;
    public Program(){
        this(1);
        System.out.println("First constructor");
        value=12;
    }
    public Program(int value){

        this.value=value;
        System.out.println("Second constructor");
    }
    public Program(int value,String text){
        this.value=value;
        this.text=text;
        System.out.println("Third constructor");
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Program myProgram=new Program();
        Program myProgram1 =new Program(10);
        Program myProgram2=new Program(11,"kkkk");


    }
}
