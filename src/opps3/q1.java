package opps3;

import java.util.Scanner;

public class q1 {
    public static class student{
        int id;
        String name;

        public student(int id, String name){
            this.id = id;
            this.name = name;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s = new student(10 , "John");
        // s.id = sc.nextInt();
        // s.name = sc.next();
        System.out.println(s.id);
        System.out.println(s.name);
        sc.close();



    }
}
