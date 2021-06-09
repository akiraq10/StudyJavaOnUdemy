package com.Study.Strings;

public class StringsDemo {
    public static void main(String[] args) {
        int aNumber=9;
        double aDouble=9.5;
        String aText="Hi";
        String aBlank= " ";
        String moreText="There";

        String hiThere=aText+aBlank+moreText;

        System.out.println(aText);
        System.out.println(aText+aBlank+moreText);
        System.out.println("Hi"+ " "+ "There ");
        System.out.println(hiThere);
        System.out.println("My number: "+aNumber+" , "+aDouble);

    }
}
