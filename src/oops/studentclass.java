package oops;
import java.util.Scanner;
public class studentclass {
    public static class student{
        String name;
        int rollno;
        double percent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student x = new student();
        x.name="jiban";
        x.rollno=1;
        x.percent=99.9;
        System.out.println(x.name);
        student y = new student();
    }
}
