package loops;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int numberofdists=0;
        int adddigits=0;
        while(n>0){
            adddigits += n%10;
            n=n/10;
            numberofdists++;
        }
        System.out.println("number of digits: " + numberofdists);
        System.out.println("sum of digits: " + adddigits);
    }

}
