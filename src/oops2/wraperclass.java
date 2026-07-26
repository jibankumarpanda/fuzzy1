package oops2;

import java.util.Scanner;


public class wraperclass {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 10;
    int b = 20;
    // System.out.println("enter a number");
    // a = sc.nextInt();


    Integer a1 = new Integer(45); // autoboxing
    

    swap(a,b);
    System.out.println(a1 + " " + a + " " + b);
    }
   static void swap(int a, int b){
        int temp = b;
        a = b;
        a = temp;
    }
}

