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
        public student(){// have to use this for error handeling and code lines minimization by avoiding multiple constructors cllaing 
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