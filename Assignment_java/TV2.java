package Assignment_java;

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV2 extends TV {
    protected int color;

    public ColorTV2(int size, int color) {
        super(size);
        this.color = color;
    }

    public void printProperty() {
        System.out.println(getSize() + " inches, " + color + " colors");
    }
}

public class TV2 {
    public static void main(String[] args) {
        ColorTV2 myTV2 = new ColorTV2(64, 1024);
        myTV2.printProperty();
    }
}

// IPTV tvMY = new IPTV("192.1.1.2", 64, 2047);
        // tvMY.printProperty();