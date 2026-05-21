package loops;
import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sumofdigits = 0;
        while(n>0){
            sumofdigits += n% 10;
            n /= 10;
        }
        System.out.println("sum of digits: " + sumofdigits);
        sc.close();
    }
}
