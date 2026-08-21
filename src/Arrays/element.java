package Arrays;
import java.util.Scanner;
public class element{
    void add(){
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = {1,2,3,4,5};
        // System.out.println("enter the array element: ");
        // int number = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            // arr[i] = number;
            System.out.println("the array is: "+arr[i]);
        }
         int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("the sum of all numbers in array: "+sum);
        int ans = -1;
        System.out.println("enter the target number: ");
        int target = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                ans = i;
                break;
            }
        }
        int withoutTarget= (sum - target);
        System.out.println("the target number is at index: "+ans);
        System.out.println("the sum without target add: "+withoutTarget);

    }
    public static void main(String[] args) {
        element obj = new element();
        obj.add();
    }
}
