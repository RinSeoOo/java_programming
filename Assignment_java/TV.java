public class TV {
    String brand;
    int year;
    int inch;

    public TV(String brand, int year, int inch){
        this.brand = brand;
        this.year = year;
        this.inch = inch;
    }
    
    public void show(){
        System.out.println("My TV is "+inch+" inches manufactured by "+brand+" in "+year);
    }
    
    public static void main(String[] args){
        TV myTV = new TV("LG", 2021, 85);
        myTV.show();
    }
}
