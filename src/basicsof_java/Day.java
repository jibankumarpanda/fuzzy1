import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        
        do {
            day = sc.nextInt();
            
            switch (day) {
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                case 6: System.out.println("Saturday"); break;
                case 7: System.out.println("Sunday"); break;
                case 0: break; // Fixed: Exits quietly when 0 is entered
                default: System.out.println("ERROR"); break; // Handles numbers like 9
            }
        } while (day >= 1 && day <= 7);
        
        sc.close();
    }
}
