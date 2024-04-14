package CodingPractice.generic_collection;

import java.util.Scanner;
abstract class Converter {
    abstract protected double convert (double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert "+getSrcString()+" to "+getDestString());
        System.out.print("Enter "+getSrcString()+" >>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.print(val+" "+getSrcString()+" is converted to "+res+" "+getDestString());
        scanner.close();
    }
}

class Won2Dollar extends Converter{    
    public double ratio;
    // public double src;
    public Won2Dollar(double ratio){ this.ratio = ratio; }
    public double convert(double src){ return src/ratio; }
    public String getSrcString(){ return "KRW"; }
    public String getDestString(){ return "USD"; }
    // public void run(){
        
    // }

}

public class converter1 {
    public static void main(String[] args){
        Won2Dollar toDollar = new Won2Dollar(1200.0);
        toDollar.run();
    }
}
