package com.Study.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int number=10;
        int[] numbers=new int[5];
        int[] nubmers1={1,2,3,4,5};
        System.out.println(numbers[0]);

        numbers[0]=15;
        numbers[1]=11;
        numbers[2]=22;
        numbers[3]=33;
        numbers[4]=1445;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);


        System.out.println("This is numbers in loop");
        for (int i=0;i< nubmers1.length;i++){

            System.out.println(nubmers1[i]);
        }

    }
}
