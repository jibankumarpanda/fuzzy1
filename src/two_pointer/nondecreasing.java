package two_pointer;
import java.util.*;
public class nondecreasing {

    static int[] calcualation(int[] arr, int power){
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
           result[i] = (int) Math.pow(arr[i], power);
        }
        return result;
       
    }
    // static void swap(int[] arr, int i, int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    // static void major(int[] arr){
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i] > arr[i+1]){
    //             // TODO: Handle the case where array is not non-decreasing
    //            swap(arr, i, i+1);
    //         }
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        nondecreasing obj = new nondecreasing();
        System.out.println("enter the power: ");
        int power = sc.nextInt();
        int[] result = obj.calcualation(arr,power);
        System.out.println("Result: " +java.util.Arrays.toString(result));
    }
}
