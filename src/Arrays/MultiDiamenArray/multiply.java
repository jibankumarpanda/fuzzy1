package Arrays.MultiDiamenArray;
import java.util.*;
public class multiply {

    static void multiplyMatrix(int[][] mat1,int[][] mat2,int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("the input of dimantion of matrix for multiplication is not correct.");
        }
        int[][] mul = new int[r1][c2];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        multiply obj = new multiply();
        System.out.println("enter teh number of matrix size n*m: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        
        System.out.println("enter the size of matrix2: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] matrix2 = new int[r2][c2]; 
        System.out.println("enter the elemts of matrix1: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter teh number of matrix2: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
       obj.multiplyMatrix(matrix1,matrix2,r1,c1,r2,c2);

    }
}
