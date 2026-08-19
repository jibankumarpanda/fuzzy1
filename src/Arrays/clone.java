package Arrays;

public class clone {
        static void change_array(int[] arr){
        for(int i=0;i<arr.length;i++){
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

        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int[] arr_2=arr;
        System.out.println("Cloned array:");
        for(int i=0;i<arr_2.length;i++){
            System.out.println(arr_2[i]);
        }

        change_array(arr);

       

    } 
    }

