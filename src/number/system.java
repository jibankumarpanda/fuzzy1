package number;
import java.util.Scanner;
public class system{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int binary_num = sc.nextInt();
       int ans = 0;
       int power = 1;
       while(binary_num > 0){
           int rem = binary_num % 10;
           ans += rem * power;
           power *= 2;
           binary_num /= 10;
       }
       System.out.println(ans);
    }
}
