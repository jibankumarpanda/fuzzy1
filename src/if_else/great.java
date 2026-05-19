package if_else;
import java.util.Scanner;
public class great {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the first number: ");
        a = sc.nextInt();
        System.out.println("enter the second number: ");
        b = sc.nextInt();
        System.out.println("enter the third number: ");
        c = sc.nextInt();
        if(a > b && a > c) {
            System.out.println("a is greatest");
        }
        else if(b > a && b > c) {
            System.out.println("b is greatest");
        }
        else {
            System.out.println("c is greatest");
        }
        sc.close();
    }
}
