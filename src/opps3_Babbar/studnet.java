package opps3_Babbar;
import java.util.*;
public class studnet{

    public int id;
    public int age;
    public String name;
    public int nos;

    public studnet(){
        System.out.println("Studnet default ctor called");
    }

    public studnet(int id, int age, String name, int nos){
        System.out.println("Studnet parametrized ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    public void study(){
        System.out.println("the student is studing");
    }
    public void sleep(){
        System.out.println("the student is sleeping");
    }
    public void bunk(){
        System.out.println("the student is bunking");
    }
}
