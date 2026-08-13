package oops2.oops2_4.abstract1;

public abstract class Son extends parent {
    @Override
    void career(String name){
        System.out.println("I am going to be a " +name);
    }
    @Override
    void parent(String name, int age) {
        // TODO Auto-generated method stub
        System.out.println("I love "+name+"she is "+age+" years old");
    }
    
}
