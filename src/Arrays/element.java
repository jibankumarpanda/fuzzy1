package Arrays;
import java.util.*;
public class element{
    // int[] allIndex(int[] arr,int target){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(target==arr[i]){
    //             count++;
    //         }
    //     }
    //     int[] indices = new int[count];
    //     int index = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(target==arr[i]){
    //             indices[index] = i;
    //             index++;
    //         }
    //     }
    //     return indices;
    // }
    void add(){
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr = {5,10,5,15,5};
        for(int i=0;i<arr.length;i++){
            System.out.println("the array is: "+arr[i]);
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("the sum of all numbers in array: "+sum);
        int maximum = 0;

        System.out.println("enter the target number: ");
        int target = sc.nextInt();

        // int[] indices = allIndex(arr, target);

        // System.out.println("the count of target number: "+indices.length);
        // System.out.print("the target number's indices: ");
        // for(int i=0;i<indices.length;i++){
        //     System.out.print(indices[i]+" ");
        // }
        // System.out.println();

        
        int count = 0;
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(count==0){
                    System.out.print("the element is at index: "+i);
                }
                else{
                    System.out.print(","+i);
                }
                count++;
            }
        }
        System.out.println(" the count of target number: "+count);

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
       
        System.out.println("the maximum element in array: "+maximum);
        int withoutTarget= (sum - target);
        System.out.println("the sum without target add: "+withoutTarget);

    }
    public static void main(String[] args) {
        element x = new element();
        x.add();
    }
}
