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
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        student x = new student(1, "A", 10, 100);
        x.roll=10;
        x.classNum=1;
        x.section="A";
        x.number=100;
        x.name="jiban";
        x.school="Hindu Mission School";
        student y = new student(2, "A", 11, 99);
        y.roll=11;
        y.classNum=2;
        y.section="A";
        y.number=99;
        y.name="Subh";
        y.school="Hindu mission school";
        sc.close();
        
    }

}