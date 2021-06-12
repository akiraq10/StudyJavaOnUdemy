package com.Study.CastingNumericalValues;

public class Demo {
    public static void main(String[] args) {
        byte byteValue=3;
        short shortValue=38;
        int intValue=12;
        long longValue=333333;
        float floatVale=333.8888f;
        double doubleValue=111.333;

        System.out.println(Byte.MAX_VALUE);

        intValue=(int) longValue;
        System.out.println(intValue);

        intValue= (int) floatVale;
        System.out.println(intValue);
    }
}
