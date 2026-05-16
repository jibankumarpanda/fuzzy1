package basicsof_java;
import java.util.Scanner;
public enum mrp {
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
        


        
    }
}
