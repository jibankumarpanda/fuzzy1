package Arrays.prefixApproach;
import java.util.*;
public class sum {

    int[] prefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int[] arr ={2,1,3,4,5};
        sum obj = new sum();
        int[] result = obj.prefixSum(arr);
        System.out.println("the sum arrya is: "+Arrays.toString(result));
    }
}
