package basicsof_java;

public class areacir {
    public static void main(String[] args) {
        int a = 5;
        float pi = 3.14f;
        // float area = pi * a*a;
        // using math 
        float area = pi * (float)Math.pow(a,2);
        System.out.println("Area of circle is: " + area);
    }
}
