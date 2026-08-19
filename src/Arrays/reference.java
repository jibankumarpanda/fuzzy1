package Arrays;
public class reference {

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        printArray(arr);

        int[] arr_2=arr.clone();
        printArray(arr_2);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr_2[i]);
        // }

    }
}
