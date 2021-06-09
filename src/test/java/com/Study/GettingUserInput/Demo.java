package com.Study.GettingUserInput;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a text line: ");
        String text=input.nextLine();
        System.out.println("Your line is "+ text);
    }
}
