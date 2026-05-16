package if_else;
import java.util.Scanner;
public record divisible() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enetr a posetive number: ");
        a = sc.nextInt();
        if(a%5==0 && a%11==0){
            System.out.println("the number is divisible by 5 and 11");
        }
        else{
            System.out.println("the number is not divisible by 5 and 11");
        }
    }
}
