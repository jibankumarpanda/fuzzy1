package Arrays.prefixApproach;
import java.util.*;
public class pointSum {

    int pointSum(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index numbers (l and m): ");
        int l = sc.nextInt();
        int m = sc.nextInt();
        
        sum sumObj = new sum();
        int[] prefix = sumObj.prefixSum(arr);
        int sum = prefix[m] - prefix[l-1];
        return sum;

    }
    public static void main(String[] args) {
        int[] arr ={2,4,1,3,6};
        pointSum obj = new pointSum();
        int result = obj.pointSum(arr);
        System.out.println("the point sum is: "+result);
    }
}
