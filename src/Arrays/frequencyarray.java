package Arrays;
import java.util.*;
public class frequencyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the numner of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter number of queries: ");
        int q = sc.nextInt();
        
    }
}
