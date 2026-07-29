package oops2.oops2_1;
import java.util.Scanner;
public class static1{
    static int a = 4;
    static int b;

    static{
        System.out.println("Static block executed");
        b = a * 4;
    }
    public static void main(String[] args){
    static1 obj = new static1();
        System.out.println("Main method executed");
        System.out.println(static1.b + " " + static1.a);
    }
}
