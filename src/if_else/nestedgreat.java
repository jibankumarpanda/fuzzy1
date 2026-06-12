package if_else;
import java.util.Scanner;
public class nestedgreat;
    public static void main(string[] avg){
        int a,b,c;
        System.out.println("enter the number: ");
        a = sc.nextInt();
        System.out.println("enter the number b: ");
        b = sc.nextInt();
        System.out.println("enter the number c: ");
        c = sc.nextInt();
        if(a>c){
            if(a>b){
                System.out.println("the a is greater");
            }
            else{
                System.out.println("the b is greater");
            }
        }
        else{
            if(b>c){
                System.out.println("the b is greater");
            }
            else{
                System.out.println("the c is greater");
            }
    }
        sc.close();
}

