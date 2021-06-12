package com.Study.ClassMethodAndObject;

class Student{
    public static final int MY_CONSTANT=033;
    public String name;
    public static String studentClass;
    public static int count=0;
    public Student(){
        count++;
    }
    public void studentName(){
//        System.out.println(name);
        System.out.println(name + " is rolled in: " +studentClass);
    }
    public static void classInfo(){
        System.out.println(studentClass);
//        System.out.println(name);

    }
}

public class StaticAndFinalDemo {
    public static void main(String[] args) {

        Student.studentClass="Web development fundamentals";
        System.out.println(Student.studentClass);

        Student.classInfo();

        System.out.println("Before creating objects: "+Student.count);

        Student student1=new Student();
        Student student2=new Student();

        System.out.println("After creating object: "+Student.count);
        student1.name="kkk";
        student2.name="abc";

        student1.studentName();
        student2.studentName();

        System.out.println(Student.MY_CONSTANT);

    }

}
