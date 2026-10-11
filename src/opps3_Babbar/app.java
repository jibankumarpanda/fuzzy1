package opps3_Babbar;
import java.util.*;
public class app {
    public static void main(String[] args) throws Exception{
        student A = new student(1, 20, "John", 1);
        // A.name="John";
        System.out.println(A.name);
        System.out.println(A.id);

        student B = new student(A);
    }
}
