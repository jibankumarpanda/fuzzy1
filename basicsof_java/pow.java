package basicsof_java;
import java.util.Scanner;
import java.lang.Math;
public class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base,power;
        System.out.println("enter the number of base: ");
        base = sc.nextInt();
        System.out.println("enter the number of power: ");
        power = sc.nextInt();
        // int result =1;
        // for(int i=0;i<power;i++){
        //     result = result * base;
        // }
        int result;
        result = (int) Math.pow(base, power);
        System.out.println(result);
    }
}
