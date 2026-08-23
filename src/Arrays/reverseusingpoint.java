package Arrays;

public class reverseusingpoint {
    static int[] reverseArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseusingpoint obj = new reverseusingpoint();
        int[] reversed = obj.reverseArray(arr);
        System.out.println("Reversed array: " + java.util.Arrays.toString(reversed));
    }
}


