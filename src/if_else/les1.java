package if_else;
import java.util.Scanner;

public class les1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("enter the element a: ");
        a = sc.nextInt();
        System.out.println("enter the element b: ");
        b = sc.nextInt();
        if(a%2==0 || b%2==0){
            System.out.println("the elemt is even");
        }
        else{
            System.out.println("the ement is odd");
        }
        
    }
}
