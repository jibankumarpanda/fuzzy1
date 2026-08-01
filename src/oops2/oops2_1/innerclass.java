package oops2.oops2_1;

public class innerclass {
  static class Test{
    String name;

public Test(String name){
    this.name = name;
}

    }
    public static void main(String[] args){
        Test obj = new Test("John");
        System.out.println(obj.name);
    }
}
