package basicsof_java;
import java.util.Scanner;
public class mrp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mrp;
        float discountpercent;
        System.out.println("enter the mrp: ");
        mrp = sc.nextFloat();
        System.out.println("enter the discount percent: ");
        discountpercent = sc.nextFloat();

        float discountammount = mrp * (discountpercent / 100);
        float finalamount = mrp - discountammount;
        System.out.println("discount amount: " + discountammount);
        System.out.println("final amount: " + finalamount);
    }
}
