package Arrays;
import java.util.*;
public class frequencyarray {

    static int[] makeFrequencyArray(int[] arr){
        int[] frequency = new int[100001];
        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the numner of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] frequency = makeFrequencyArray(arr);
        System.out.println("enter number of queries: ");
        int q = sc.nextInt(); 
        
        while(q > 0){
            System.out.println("enter the number to be searched: ");
            int x = sc.nextInt();
            if(frequency[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("NO");
            }

            q--;
        }
    }
}
