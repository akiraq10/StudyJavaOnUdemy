package com.Study.Arrays;

import java.util.Random;

public class MultidimensionalArrayDemo {
    public static void main(String[] args) {
        int[] oneDimensionalArray={13,123,922};
        System.out.println(oneDimensionalArray[2]);

        int[][] multiDimensionalArray={{2,3,4},{22,33,44,55},{222,333,444}};
        System.out.println(multiDimensionalArray[1][3]);//1 is array 1st, 3 is item 3rd in array
        System.out.println(multiDimensionalArray[2][1]);//2 is array 2sd, 1 is item 1st in array

        double[][] doubleArray=new double[4][3];//4 number arrays,3 item numbers in array

//        doubleArray[3][1]=3.4;
//        System.out.println(doubleArray[3][1]);


        for(int array=0;array< multiDimensionalArray.length;array++){
            for (int item=0;item<multiDimensionalArray[array].length;item++){
                System.out.print(multiDimensionalArray[array][item]+ "\t");
            }
        }

        int value=new Random().nextInt(3)+5;
        for (int array=0;array< doubleArray.length;array++){
            for (int item=0;item<doubleArray[array].length;item++){
                doubleArray[array][item]=value;
                System.out.print(doubleArray[array][item]+"\t");
            }
        }
    }
}
