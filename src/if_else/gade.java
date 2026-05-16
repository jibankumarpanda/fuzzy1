package if_else;
import java.util.Scanner;
public class gade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the grade: ");
        char grade = sc.next().charAt(0);
        if(grade == 'A') {
            System.out.println("excellent");
        }
        else if(grade == 'B') {
            System.out.println("good");
        }
        else if(grade == 'C') {
            System.out.println("average");
        }
        else if(grade == 'D') {
            System.out.println("poor");
        }
        else {
            System.out.println("invalid grade");
        }
        sc.close();
    }
}
