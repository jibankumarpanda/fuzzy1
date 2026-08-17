package Arrays;
import java.util.Scanner;

import number.system;
public class sumArray {

    void demo(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[2];
        System.out.println("enter the number: ");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.println("the array is: " + array[i]);
        }
        int sum = 0;
      
        for(int i=0;i<array.length;i++){
           sum += array[i];
    }
     System.out.println("the sum is: " + sum);
}
    public static void main(String[] args){
        sumArray obj = new sumArray();
        obj.demo();
    } 
}