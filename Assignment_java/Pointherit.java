package Assignment_java;

class Point{
    private int x, y;
    public Point(int x, int y){ this.x = x; this.y = y; }
    public int getX(){ return x; }
    public int getY(){ return y; }
    protected void move(int x, int y){ this.x = x; this.y = y; }
}

class ColorPoint extends Point{
    String color;
    public ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    public void setXY(int x, int y){
        move(x, y);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        String str = color+" color on ("+getX()+", "+getY()+")";
        return str;
    }
}

class ColorPoint2 extends Point{
    String color;

    ColorPoint2(){
        super(0, 0);
        color = "BLACK";
    }

    ColorPoint2(int x, int y){
        super(x, y);
    }

    public void setXY(int x, int y){
        move(x, y);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        String str = color+" color on ("+getX()+", "+getY()+")";
        return str;
    }
}

public class Pointherit {
    public static void main(String[] args){
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str);
        // RED color on (10, 20)

        ColorPoint2 zeroPoint = new ColorPoint2();  // Set BLACK on (0, 0)
        System.out.println(zeroPoint.toString());

        ColorPoint2 cp2 = new ColorPoint2(10, 10);
        cp2.setXY(5, 5);
        cp2.setColor("RED");
        System.out.println(cp2.toString());
    }
}
