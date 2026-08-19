package Arrays; 
import java.util.Scanner; 

public class CountElements { // Changed class name to capitalize (Java standard)

    // Moved the method inside the class and renamed it
    public void findAndCount() { 
        Scanner sc = new Scanner(System.in); 
        int[] arr = {10, 20, 30, 40, 50}; // Simplified array creation
        
        for(int i = 0; i < arr.length; i++){ 
            System.out.println(arr[i]); 
        } 
        
        System.out.println("Enter the number to count: "); 
        int number = sc.nextInt(); 
        
        int count = 0; 
        int ans = -1; // Fixed: Removed quotes and fixed semicolon position
        
        for(int i = 0; i < arr.length; i++){ 
            if(arr[i] == number){ 
                ans = i; 
                count++; 
                // Removed 'break' so it can keep counting if numbers duplicate
            } 
        } 
        
        System.out.println("Last index of " + number + " is " + ans); 
        System.out.println("Count of " + number + " is " + count); 
        sc.close(); // Good practice: Close the scanner
    } 

    public static void main(String[] args) { 
        CountElements obj = new CountElements(); 
        obj.findAndCount(); // Called the renamed method
    } 
}
