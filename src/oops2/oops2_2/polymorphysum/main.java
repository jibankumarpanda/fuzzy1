package oops2.oops2_2.polymorphysum;

public class main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle circle = new circle();
        squar squar = new squar();
        triangle triangle = new triangle();
        shape.area();
        circle.area();
        squar.area();
        triangle.area();
    }
}
