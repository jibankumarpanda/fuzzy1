package oops2.oops2_3.access;
public class a{
    private int num;
    String name;
    int[] arr;
    
    public int getNum(){
        return num;
    }
    
    public a(int num,String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
}