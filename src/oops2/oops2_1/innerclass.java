package oops2.oops2_1;

class Tesr{// without static so i can use it out side of the class
    String name;

public Tesr(String name){
    this.name = name;
}
}

public class innerclass {
  static class Test{// with static so i have to use it inside the file class
//without static cant oparate the public static void main(String[] args)
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
