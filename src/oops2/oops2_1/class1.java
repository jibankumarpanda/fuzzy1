package oops2.oops2_1;
import java.util.Scanner;
// import oops2.oops2_1.massage;  we dont need this because we are in same folder or package 
// we have to use import when we are in different package or folder and need to call that
public class class1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello World");
    massage.printMassage();
    sc.close();
  }
}