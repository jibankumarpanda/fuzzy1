package opps3_Babbar;
import java.util.*;
public class app {
    public static void main(String[] args) throws Exception{
        student A = new student(1, 20, "John", 1, "Jane");
        // A.name="John";
        System.out.println(A.name);
        System.out.println(A.id);
        
        System.out.println(A.getGF());
        A.setID(10);
        System.out.println(A.id);
        
        student B = new student(A);
        B.setID(20);
        A.setID(30);
        System.out.println(B.id);
        System.out.println(A.id);
        A.gfChating();
        A.bunk(); 
    }
}
