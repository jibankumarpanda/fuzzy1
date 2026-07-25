package oops2;
import java.util.Scanner;
public class class4{
    public static class student{
        int classNum;
        String section;
        int roll;
        String name;
        float number;
        String school;
        
//         this.classNum - refers to the instance variable (the field belonging to the object)

// classNum (without this) - refers to the parameter passed to the constructor

// Why you need it:
// Since both the parameter and the instance variable have the same name (classNum), Java needs to know which one you mean

        public student(int classNum,String section,int roll,float number){
            this.classNum = classNum;
            this.section = section;
            this.roll = roll;
            this.number = number;
        }
        public student(String name,String school){
            this.name = name;
            this.school = school;
        }
        public student(){// Allows object creation without parameters - You can now call new student() without passing any arguments
            //and not use this if you want to use constructors with parameters
            // Instead of:
    // Default constructor and no-argument constructor
}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        student x = new student();
// student x = new student();
// // Use:
// student x = new student(1, "A", 10, 100);
// // or
// student x = new student("jiban", "Hindu Mission School");
        x.roll=10;
        x.classNum=1;
        x.section="A";
        x.number=100;
        x.name="jiban";
        x.school="Hindu Mission School";
        student y = new student();
        y.roll=11;
        y.classNum=2;
        y.section="A";
        y.number=99;
        y.name="Subh";
        y.school="Hindu mission school";
        System.out.println(x.name + " " + x.school);
        System.out.println(y.name + " " + y.school);
        sc.close();
        
    }
}