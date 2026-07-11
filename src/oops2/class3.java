package oops2;
import java.util.Scanner;
public class class3{
    public static void main(String[] args){
        // this are normall data type defined as array separet separet
        int[] numbers = new int[5];
        int[] rno = new int[5];
        String[] name = new String[5];
        //now we are making a class which contain the all these data type with properties 
        //class name student
        public static class student{
            int[] roll=new int[5];
            String[] name=new String[5];
            float[] number=new float[5];
            //constructur
            public student(int[] roll, String[] name, float[] number){
                this.roll = roll;
                this.name = name;
                this.number = number;
            }
        }

        

    }
}