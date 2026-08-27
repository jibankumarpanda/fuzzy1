package two_pointer;
import java.util.*;
public class nondecreasing {

    static void power(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] * arr[i];
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void major(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[i+1]){
                // TODO: Handle the case where array is not non-decreasing
               swap(arr, i, i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        nondecreasing obj = new nondecreasing();
        obj.major(arr);
        obj.power(arr);
    }
}
