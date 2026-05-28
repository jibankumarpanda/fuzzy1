package loops2;
import java.util.Scanner;
public class pattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.print("enter the row: ");
        r = sc.nextInt();
        System.out.print("enter the column: ");
        c = sc.nextInt();
        for(int i=1;i<=r;i++){
          for(int j=1;j<=c;j++){
            if(i==1||i==r||j==1||j==c){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
          }
            System.out.println();
        }
    }
}