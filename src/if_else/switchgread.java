package if_else;
import java.util.Scanner;
public class switchgread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the grade: ");
        char grade = sc.next().charAt(0);
        switch(grade) {
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("average");
                break;
            case 'D':
                System.out.println("poor");
                break;
            default:
                System.out.println("invalid grade");
        }
        sc.close();
    }
}
