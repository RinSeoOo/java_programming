package Assignment_java;

class Rectangle{
    public int x;
    public int y;
    public int wid;
    public int hei;

    public Rectangle(int x, int y, int wid, int hei){
        this.x = x; this.y = y;
        this.wid = wid; this.hei = hei;
    }

    public int square(){
        return wid * hei;
    }

    public void show(){
        System.out.println("Rectangle at ("+x+","+y+") with area " + square());
    }

    public boolean contains(Rectangle r){
        
    }
}

public class Rectangle_22 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.sho();
        System.out.println("Area : " + s.square());
        if(t.contains(r)) System.out.println("t includes r");
        if(t.contains(s)) System.out.println("t includes s");
    }
}
