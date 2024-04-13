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
        boolean tf = false;
        if(r.square() < square()){
            tf = true;
        }
        return tf;
        /*
         * 다음멤버를가지고직사각형을표현하는 Rectangle 클래스를작성하라.
         * ●int 타입의 x, y, width, height 필드 : 사각형을구성하는점과크기정보 (x, y)는사각형의좌상단꼭지점의좌표로한다.
         * ●x, y, width, height 값을매개변수로받아필드를초기화하는생성자
         * ●boolean contains(Rectangle r) : 매개변수로받은 r이 현사각형안에있으면 true 리턴
         */
    }
}

public class Rectangle_22 {
    public static void main(String[] args){
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("Area : " + s.square());
        if(t.contains(r)) System.out.println("t includes r");
        if(t.contains(s)) System.out.println("t includes s");
    }
}
