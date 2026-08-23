//sort ans array consisting only 0s and 1s
package two_pointer;
import java.util.*;
public class sortArray {

    static int[] printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroAndOnes(int[] arr){
        int n = arr.length;
        int zero = 0;
        //count number of zeroes
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        // 0 to zero -1 should be 0
        // zero to n-1 should be 1
        for(int i=0;i<n;i++){
            if(i<zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    System.out.println("enter the size of array: ");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("enter the elements of array: ");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("orginal array: "+java.util.Arrays.toString(arr));
    sortZeroAndOnes(arr);
    System.out.println("sorted array: ");
    printArray(arr);
    }
}
