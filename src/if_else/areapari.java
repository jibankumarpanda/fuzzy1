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
        int area = length * breadth;
        if(length == breadth) {
            System.out.println("it is a square");
            int parimeter = 2 * (length + breadth);
            System.out.println("parimeter of square is " + parimeter);
            if(area > parimeter || area == parimeter) {
                System.out.println("area is greater than or equal to parimeter");
            }
            else {
                System.out.println("area is not greater than or equal to parimeter");
            }
        }
        else {
            System.out.println("it is not a square");
        }
    }
}
