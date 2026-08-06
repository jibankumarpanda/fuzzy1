package oops2.oops2_2.inheritance;

public class Box {
    double l;
    double h;
    double w;

  Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    Box(double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }
    Box(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    public void information(){
        System.out.println("Length: " + this.l);
        System.out.println("Height: " + this.h);
        System.out.println("Width: " + this.w);
    }

}
