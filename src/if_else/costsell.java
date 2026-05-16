package if_else;
import java.util.Scanner;
public class costsell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sell_price;
        int cost_price;
        System.out.println("enter the cost price:");
        cost_price = sc.nextInt();
        System.out.println("enter the sell price:");
        sell_price = sc.nextInt();
        if(sell_price > cost_price) {
            System.out.println("profit");
        }
        else if(sell_price < cost_price) {
            System.out.println("loss");
        }
        else {
            System.out.println("no profit no loss");
        }
    }
}
