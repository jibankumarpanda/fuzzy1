package if_else;
import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the number: ");
        a = sc.nextInt();
        if(a>=100 && a<=999){
            System.out.println("three digit number");
        }
        else{
            System.out.println("not a three digit number");
        }
    }
}
