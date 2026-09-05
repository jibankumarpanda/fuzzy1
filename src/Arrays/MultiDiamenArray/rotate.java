package Arrays.MultiDiamenArray;
import java.util.*;
public class rotate {

    void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
        void rotateMatrix(int[][] matrix,int r,int c) {
        //reverse each row of transpose matrix
        for(int i=0;i<r;i++){
            reverse(matrix[i]);
        }
        System.out.println("the rotated matrix is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
     void matrixTranspose(int[][] matrix,int r,int c) {
        // Create new matrix with swapped dimensions
        int[][] transposed = new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println("the transpose matrix is: ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(transposed[i][j] +" ");
            }
            System.out.println();
        }
         rotateMatrix(transposed, c, r);
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rotate obj = new rotate();
        System.out.println("enter the size of the matix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("enter the elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the original matrix: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        obj.matrixTranspose(matrix, r, c);
    }
}
