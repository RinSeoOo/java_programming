package CodingPractice.generic_collection;

interface Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("-- Redraw : ");
        draw();
    }
}

class Circle implements Shape{
    protected double rad;
    protected Circle(double rad){
        this.rad = rad;
    }
    @Override
    public void draw(){
        System.out.println("Circle with radis "+rad);
    }
    @Override
    public double getArea(){
        return rad * rad * PI;
    }
}

public class Shape_4 {
    public static void main(String[] args){
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("Area : "+donut.getArea());
    }
}
