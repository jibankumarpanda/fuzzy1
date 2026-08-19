package Arrays; 
import java.util.Scanner; 

public class CountElements { // Changed class name to capitalize (Java standard)

    // Moved the method inside the class and renamed it
    public void findAndCount() { 
        Scanner sc = new Scanner(System.in); 
        int[] arr = {5, 20, 5, 40, 5}; // Simplified array creation
        
        for(int i = 0; i < arr.length; i++){ 
            System.out.println(arr[i]); 
        } 
        
        System.out.println("Enter the number to count: "); 
        int number = sc.nextInt(); 
        
        int count = 0; 
        int ans = -1; // Fixed: Removed quotes and fixed semicolon position
        int allIndex=-1;
        int greatthanAns=0;
        for(int i = 0; i < arr.length; i++){ 
            if(arr[i] == number){ 
                ans = i; 
                count++; 
                // Removed 'break' so it can keep counting if numbers duplicate
            } 
        } 
        for(int i=0;i<arr.length;i++){
            if(arr[i] == number){
                allIndex = i;
                System.out.println("all index where " + number + " is found:" + allIndex);
            }
            if(arr[i] > number){
                greatthanAns++;
                System.out.println("Greater than " + number + " is " + arr[i]);
            }
        }
        System.out.println("Greater than " + number + " is " + greatthanAns);
        System.out.println("Last index of " + number + " is " + ans); 
        System.out.println("Count of " + number + " is " + count); 
        sc.close(); // Good practice: Close the scanner
    } 

    public static void main(String[] args) { 
        CountElements obj = new CountElements(); 
        obj.findAndCount(); // Called the renamed method
    } 
}
