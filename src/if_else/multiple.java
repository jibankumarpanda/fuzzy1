package if_else;
import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter the number: ");
        a = sc.nextInt();
        if(a>=90 && a<=100){
            System.out.println("A grade");
        }
        else if(a>=80 && a<90){
            System.out.println("B grade");
        }
        else if(a>=70 && a<80){
            System.out.println("C grade");
        }
        else if(a>=60 && a<70){
            System.out.println("D grade");
        }
        else if(a>=40 && a<60){
            System.out.println("F grade");
        }
        else{
            System.out.println("Fail");
        }
    }  
}
