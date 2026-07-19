package if_else;
import java.util.Scanner;
public class maths{
    public static void main(String[] avg){
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
        System.out.println("enter the number: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("enter the number: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("enter the number: ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        int a,b;
        a = ((y2-y1)/(x2-x1));
        b = ((y3-y2)/(x3-x2));
        System.out.println("a = " + a);
        System.out.println("b = " + b);
            if(a==b){
                System.out.println("this is a straightline");
            }
            else{
                System.out.println("this is not a straightline");
            }
        sc.close();
    }
}
