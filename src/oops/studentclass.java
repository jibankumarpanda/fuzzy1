package oops;
import java.util.Scanner;
public class studentclass {
   
    public static class car{
        String name;
        String color;
        int price;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car c = new car();
        c.name="BMW";
        c.color="black";
        c.price=1000000;
        student x = new student();
        x.name="jiban";
        x.rollno=1;
        x.percent=99.9;
        System.out.println(x.name);
        student y = new student();
    }
}
