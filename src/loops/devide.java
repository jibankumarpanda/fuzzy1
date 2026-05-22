package loops;
import java.util.Scanner;
public class devide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numofdigits = 0;
        while(n > 0){
            n = n/10;
            numofdigits++;
        }
        System.out.println("Number of digits: " + numofdigits);
        
    }
}
