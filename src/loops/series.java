package loops;
import java.util.Scanner;
public class series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        int ans = 0;
        System.out.println("enter the number: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0){
                ans -= i;
            }
            else{
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
