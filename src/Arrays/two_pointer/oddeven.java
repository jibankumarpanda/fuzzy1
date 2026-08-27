package Arrays.two_pointer;
import java.util.Arrays;
import java.util.Scanner;
public class oddeven {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void odd(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            //move left if the number is even (we want evens at front)
            while(left < right && arr[left] % 2 == 0){
                left++;
            }
            //move right if the number is odd (we want odds at back)
            while(left < right && arr[right] % 2 != 0){
                right--;
            }
            //swap when left points to odd and right points to even
            if(left < right){
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        oddeven obj = new oddeven();
        System.out.println("enter the array size: ");
        int n = sc.nextInt();
        System.out.println("enter the array numbers: ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the orginal array: "+java.util.Arrays.toString(arr));
        obj.odd(arr);
        
        System.out.println("the modified array: "+java.util.Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("the sorted array: "+java.util.Arrays.toString(arr));
    }
}
