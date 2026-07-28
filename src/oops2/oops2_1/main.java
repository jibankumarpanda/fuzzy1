package oops2.oops2_1;

// import oops2.oops2_1.example.Human;

// import oops2.oops2_1.example.Human;

public class main {
    public static void main(String[] args){
        // example ex = new example();    
        //we have to use this ex. thing if the class is non static defined in the example.java
        // example.Human jiban = ex.new Human(25, "Jiban", 50000, false);
        // System.out.println(jiban.name);
       example.Human jiban = new example.Human(25, "Jiban", 50000, false);
       example.Human ram = new example.Human(25, "ram", 50000, false);
       example.Human shyam = new example.Human(25, "shyam", 50000, false);
        System.out.println(jiban.name);
        System.out.println(ram.name);
        System.out.println(shyam.name);
        System.out.println(example.Human.population);
       
    }
}
