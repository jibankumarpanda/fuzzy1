package Arrays.prefixApproach;
import java.util.*;
public class sufixPart {

    void match(int[] prefix, int[] sufix){
        for(int i=0;i<prefix.length-1;i++){
            if(prefix[i]==sufix[i+1]){
                System.out.println("True"+" match found at index "+i);
            }
            else 
                System.out.println("False");
        }
    }

    void diplaySum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.print(sum+" ");
        }
        System.out.println("the sum of array is: "+sum);
    }
    int[] sufix(int[] arr){
        int[] sufix = new int[arr.length];
        sufix[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            sufix[i]=sufix[i+1]+arr[i];
        }
        return sufix;
    }

    int[] prefix(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elments in array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the real array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        sufixPart obj1 = new sufixPart();
        sufixPart obj2 = new sufixPart();
        int[] result1 = obj1.prefix(arr);
        System.out.println("the prefix array sum is: "+Arrays.toString(result1));
        int[] result2 = obj2.sufix(arr);
        System.out.println("the sufix array sum is: "+Arrays.toString(result2));
        obj2.diplaySum(arr);
        obj2.match(result1, result2);
    }
}
