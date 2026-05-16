package if_else;
import java.util.Scanner;
public class areapari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        int breadth;
        System.out.println("enter the length:");
        length = sc.nextInt();
        System.out.println("enter the breadth:");
        breadth = sc.nextInt();
        if(length == breadth) {
            System.out.println("it is a square");
        }
        else {
            System.out.println("it is not a square");
        }
    }
}
