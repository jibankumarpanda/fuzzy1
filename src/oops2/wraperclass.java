package oops2;

import java.util.Scanner;


public class wraperclass {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
// Integer a = 10;           // Wrapper object
// Integer b = 20;           // Wrapper object
// Integer a1 = new Integer(45);  // Wrapper object

// Integer[] arr = new Integer[]{a, b};  // ← Use Integer array (wrappers)
// swap(arr);
// a = arr[0];
// b = arr[1];

    Integer a = 10;
    Integer b = 20;
    // int a = 10;
    // int b = 20;
    // System.out.println("enter a number");
    // a = sc.nextInt();


    int a1 = new Integer(45); // autoboxing
    

    int[] arr = new int[]{a, b};
    swap(arr);
    a = arr[0];
    b = arr[1];

    System.out.println(a1 + " " + a + " " + b);
    sc.close();
    }
//    static void swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;
//     }
// static void swap(Integer a, Integer b){
//     Integer temp = a;
//     a = b;
//     b = temp;
// }    
        static void swap(int[] arr){
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            
        }
}
// Primitive  |	Wrapper Class
// int	      |  Integer
// double     |  Double
// char	      |  Character
// boolean	  |  Boolean



