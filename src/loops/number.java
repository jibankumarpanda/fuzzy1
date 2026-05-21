package loops;
import java.util.Scanner;
public class number{
    public static void main(string[] avg){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("enter the number: ");
        a = sc.nextInt();
        while(a<=1){
            System.out.println("the numbers: "+a);
            a--;
        }
        sc.close();
    }
}