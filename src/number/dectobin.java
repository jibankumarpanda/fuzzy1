package number;
import java.util.Scanner;
public class dectobin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int power = 1;
        while(n > 0){
            int rem = n % 2;
            ans += rem * power;
            power *= 10;
            n /= 2;
        }
        System.out.println(ans);
    }
}