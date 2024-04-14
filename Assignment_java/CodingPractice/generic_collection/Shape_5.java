package CodingPractice.generic_collection;

class Rect implements Shape{
    protected double width;
    protected double height;
    protected Rect(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Rectangle with size "+width+"X"+height);
    }
    @Override
    public double getArea(){
        return width * height;
    }
}

public class Shape_5 {
    public static void main(String[] args){
        Shape[] list = new Shape[2];
        list[0] = new Circle(10);
        list[1] = new Rect(10, 40);

        for(int i=0;i<list.length;i++) list[i].redraw();
        for(int i=0;i<list.length;i++){
            System.out.println("Area : "+list[i].getArea());
        }
    }
}
