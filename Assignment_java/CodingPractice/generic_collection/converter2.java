package CodingPractice.generic_collection;

import java.util.Scanner;
// abstract class Converter {
//     abstract protected double convert (double src);
//     abstract protected String getSrcString();
//     abstract protected String getDestString();
//     protected double ratio;

//     public void run(){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Convert "+getSrcString()+" to "+getDestString());
//         System.out.print("Enter "+getSrcString()+" >>> ");
//         double val = scanner.nextDouble();
//         double res = convert(val);
//         System.out.print(val+" "+getSrcString()+" is converted to "+res+" "+getDestString());
//         scanner.close();
//     }
// }

class Km2Mile extends Converter{    
    public double ratio;
    // public double src;
    public Km2Mile(double ratio){ this.ratio = ratio; }
    public double convert(double src){ return src/ratio; }
    public String getSrcString(){ return "km"; }
    public String getDestString(){ return "Mile"; }
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

public class converter2 {
    public static void main(String[] args){
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}
