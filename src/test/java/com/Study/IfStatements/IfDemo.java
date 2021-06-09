package com.Study.IfStatements;

public class IfDemo {
    public static void main(String[] args) {
//        boolean comparison =3<6;
//        boolean notEqual= 3!=4;
//        boolean equals= 5==4;
//        System.out.println(comparison);
//        System.out.println(notEqual);
//        System.out.println(equals);
        int amount=0;
//        if (amount<21){
//            System.out.println("It is True;");
//        }
//        else if (amount>31)
//        {
//            System.out.println("It is False;");
//        }
//        else
//        {
//            System.out.println("None of the above");
//        }
        while (amount<6){
            System.out.println("In the loop");

            if(amount==6){
                break;
            }

            amount++;
            System.out.println("Out of loop");
        }
    }
}
