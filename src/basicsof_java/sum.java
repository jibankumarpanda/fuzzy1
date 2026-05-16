package basicsof_java;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a: ");
        int a = sc.nextInt();
        System.out.println("enter the number b: ");
        int b = sc.nextInt();
        System.out.println("the answer: " + (a + b));
        sc.close();

    }
}
