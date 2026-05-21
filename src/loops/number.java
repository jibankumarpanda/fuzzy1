package loops;
import java.util.Scanner;
public class number{
    public static void main(String[] avg){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("enter the number: ");
        a = sc.nextInt();
        int n = 1;
        while(n <=a){
            System.out.println("the numbers: "+a);
            a++;
        }
        sc.close();
    }
}