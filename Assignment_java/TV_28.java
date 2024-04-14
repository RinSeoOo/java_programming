
class TV_new {
    private int size;

    public TV_new(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV2 extends TV_new {
    protected int color;

    public ColorTV2(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() { System.out.println(getSize() + " inches, " + color + " colors"); }
}

class IPTV extends TV_new {
    protected int color;
    public String addr;

    public IPTV(String addr, int size, int color) {
        super(size);
        this.color = color;
        this.addr = addr;
    }

    public void printProperty() {
        System.out.println("My IPTV is " + getSize() + " inches, " + color + " colors and IP address is "+addr);
    }
}

public class TV_28 {
    public static void main(String[] args) {
        ColorTV2 myTV2 = new ColorTV2(64, 1024);
        myTV2.printProperty();

        
        IPTV tvMY = new IPTV("192.1.1.2", 64, 2047);
        tvMY.printProperty();
        
    }
}

// IPTV tvMY = new IPTV("192.1.1.2", 64, 2047);
// tvMY.printProperty();