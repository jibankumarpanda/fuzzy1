package oops2;
import java.util.Scanner;
public class class2{
    public static class student{
        int roll;
        String name;
        float number;
        String school;

        public student(int roll,String name,float number){
            this.roll=roll;
            this.name=name;
            this.number=number;
        }
        public student(String school,String name){
            this.school=school;
            this.name=name;
        }
       
    }
    public static void main(String[] args){
        Scanner sc = new scanner(System.in);
        student x = new student();

        x.roll=1;
        x.name="jiban";
        x.school="Hindu";
        System.out.println(x.name + " " + x.school+" "+x.roll);
        
    }
}