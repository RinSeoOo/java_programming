package Assignment_java;

public class RERERERERRERectangle {
    public int x;
    public int y;
    public int width;
    public int height;
    public int area;

    public RERERERERRERectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square(){
        return area = width * height;
    }

    public void show(){
        square();
        System.out.println("Rectangle at ("+x+","+y+") with area "+ this.area);
    }

    public boolean contains(RERERERERRERectangle r){
        square();
        if(r.square() < this.area) return true;
        else return false;
    }

    public static void main(String[] args){
        RERERERERRERectangle r = new RERERERERRERectangle(2, 2, 8, 7);
        RERERERERRERectangle s = new RERERERERRERectangle(5, 5, 6, 6);
        RERERERERRERectangle t = new RERERERERRERectangle(1, 1, 10, 10);

        r.show();
        System.out.println("Area : " + s.square());
        if(t.contains(r)) System.out.println("t includes r");
        if(t.contains(s)) System.out.println("t includes s");

    }
}
