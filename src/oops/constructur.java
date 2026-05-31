package oops;

import java.util.Scanner;


public class constructur {
    public static void main(String[] args) {
        student s1 = new student("jibankumarpanda", 2, 98.5);
        student x = new student("jiban", 1, 99.9);
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.percent);
}
}