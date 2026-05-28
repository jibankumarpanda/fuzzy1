package loops2;
import java.util.Scanner;
public class pattern7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.print("enter the number of r: ");
        r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c-i;j++){
               if((i+j)%2==0){
                System.out.print("1");
               }
               else{
                System.out.print("0");
               }
            }
            System.out.println();
        }
        
    }
}