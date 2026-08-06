package oops2.oops2_2.inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(Box other){
        super(other);
        if (other instanceof BoxWeight) {
            weight = ((BoxWeight) other).weight;
        } else {
            weight = -1;
        }
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }

    public BoxWeight(double l,double h,double w,double weight){
        super(l, h, w);
        this.weight=weight;
    }
    
    
}
