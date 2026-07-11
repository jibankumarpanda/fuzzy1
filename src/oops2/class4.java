package oops;
import java.util.Scanner;
public class class4{
    public static class student{
        int class;
        String section;
        int roll;
        String name;
        float number;
        String school;

        public student(int class,int section,int roll,float number){
            this.class = class;
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
        student x = new student();
        x.roll=10;
        x.class=1;
        x.section="A";
        x.number=100;
        
    }

}