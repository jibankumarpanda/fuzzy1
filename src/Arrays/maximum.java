package Arrays;
import java.util.Scanner;
public class maximum {
    void maximum(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("enter the numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans = 0;
        
        for(int i=0;i<arr.length;i++){
           if(arr[i]>ans){
            ans = arr[i];
           }
        }
        System.out.println("the maximum number is: "+ans);
    }
    public static void main(String[] args) {
        maximum obj = new maximum();
        obj.maximum();
    }
}
