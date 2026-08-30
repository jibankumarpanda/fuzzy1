package Arrays.MultiDiamenArray;
import java.util.*;
public class TWOD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the matrix should be n*m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("enter the numbers");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
