package loops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("enter the number: ");
        n = sc.nextInt();
        int fact = 1;
        for(i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
