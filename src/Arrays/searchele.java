package Arrays;
import java.util.Scanner;
public class searchele {
    void demo(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=0;
        int ans = -1;
        System.out.println("enter the number to search: ");
        target = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                ans = i;
            }
        }
        System.out.println("the search number is: "+ ans);
    }
    public static void main(String[] args) {
        searchele obj = new searchele();
        obj.demo();
    }
}
