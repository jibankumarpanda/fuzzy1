package oops2; 
import java.util.Scanner; 

public class class1 { 
    // Correct way to define an inner class
    public static class student {
        // 1. Declare the instance variables (fields)
        int roll;
        String name;
        float number;

        // 2. Define the constructor separately
        public student(int roll, String name, float number) {
            this.roll = roll;
            this.name = name;
            this.number = number;
        }

        // 3. Provide a default constructor so "new student()" works
        public student() {
        }
    } 

    public static void main(String[] args) { 
        // This now works because of the default constructor
        student x = new student(); 
        x.roll = 1; 
        x.name = "jiban"; 
        System.out.println(x.name); 
    } 
}
