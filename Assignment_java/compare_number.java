
import java.util.Scanner;

public class compare_number {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int mid;
        if(a >= b){
            if(b >= c) mid = b;
            else {
                if(a >= b) mid = c;
                else mid = a;
            } 
        } else {
            if(c>=a){
                if(b>=c) mid = c;
                else mid = b;
            }
            else mid = a;
        }     
        
        System.out.println("Middle number is "+ mid);
        sc.close();
    }
}
