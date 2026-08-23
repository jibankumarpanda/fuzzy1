package Arrays;
import java.util.Scanner;
public class reverse {
    static int[] reverseArray(int arr[]){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        // System.out.println("Reversed array: " + java.util.Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse obj = new reverse();
        int[] reversed = obj.reverseArray(arr);
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversed));
    }
}
