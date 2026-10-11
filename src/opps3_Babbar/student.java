package opps3_Babbar;
import java.util.*;
public class student{

    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    public String getGF(){
        return this.gf;
    }

    public void setID(int a){
        this.id = a;
    }

    public student(){
        System.out.println("Studnet default ctor called");
    }

    public student(int id, int age, String name, int nos,String gf){
        System.out.println("Studnet parametrized ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    public student(student copy){ //copy = A
        System.out.println("copy constructor");
        this.id = copy.id;
        this.age = copy.age;
        this.name = copy.name;
        this.nos = copy.nos;
        this.gf = copy.gf;
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
    public void gfChating(){
        System.out.println("the studnet chating with gf");
    }
}
