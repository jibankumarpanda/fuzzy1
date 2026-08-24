package two_pointer;
import java.util.Scanner;
public class oddeven {

    static int[] odd(int[] arr){
        int left = 0;
        int right =arr.length-1;
        while(left<right || left>right){
            //move left if the number is odd
            while(arr[left]%2!=0){
                left++;
            }
            //move right if the number is even
            while(arr[right]%2==0){
                right--;
            }
            
        }
        
        return arr;
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
    }
}
