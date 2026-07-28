package oops2.oops2_1;
import java.util.Scanner;
public class example {

    public static class Human{ // it is static but if it non static then we have to use ex.
        int age;
        String name;
        int salary;
        boolean married;
        static long population;

        public Human(int age, String name, int salary, boolean married){
            this.age=age;
            this.name=name;
            this.salary=salary;
            this.married=married;
            Human.population++;
        }

        public Human(){

        }
    }
}
