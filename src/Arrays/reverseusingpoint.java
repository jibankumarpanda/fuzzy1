package Arrays;

public class reverseusingpoint {
    static int[] reverseArray(int arr[],int k){
        int n = arr.length;
        int ans[] = new int[n];
        k = k % n;
        
        // Copy last k elements to the front
        int j = 0;
        for(int i = n - k; i < n; i++){
            ans[j++] = arr[i];
        }
        
        // Copy remaining elements
        for(int i = 0; i < n - k; i++){
            ans[j++] = arr[i];
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int[] reversed = reverseArray(arr, k);
        System.out.println("Rotated array: " + java.util.Arrays.toString(reversed));
    }
}


