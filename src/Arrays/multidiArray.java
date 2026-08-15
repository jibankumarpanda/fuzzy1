package Arrays;
import java.util.Scanner;
public class multidiArray {
    void demo() {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][4];
        System.out.println("enter the array: ");
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("the arrat is: ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
       multidiArray obj = new multidiArray();
        obj.demo();
    }
}
