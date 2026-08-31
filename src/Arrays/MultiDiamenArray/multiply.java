package Arrays.MultiDiamenArray;
import java.util.*;
public class multiply {

    static void multiplyMatrix(int[][] mat1,int[][] mat2){
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        multiply obj = new multiply();
        System.out.println("enter teh number of matrix size n*m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];
        System.out.println("enter the elemts of matrix1: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter teh number of matrix2: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
       obj.multiplyMatrix(matrix1,matrix2);

    }
}
