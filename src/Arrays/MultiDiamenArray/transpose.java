package Arrays.MultiDiamenArray;
import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the matrix r1*c1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int matrix1[][] = new int[r1][c1];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("the real matrix: ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("the transpose matrix is: ");
        for(int i = 0; i < c1; i++) {
            for(int j = 0; j < r1; j++) {
                System.out.print(matrix1[j][i] + " ");
            }
            System.out.println();
        }

    }
}
