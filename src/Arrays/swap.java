package Arrays;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter the number: ");
        a = sc.nextInt();
        System.out.println("enter the number: ");
        b = sc.nextInt();
        // int temp = a;
        // a=b;
        // b = temp;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a + " b = " + b);
    }
}
