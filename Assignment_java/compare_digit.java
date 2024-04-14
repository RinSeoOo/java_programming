
import java.util.Scanner;

public class compare_digit {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);

        int nData = sc.nextInt();
        System.out.println("Input 2-digit integer(10-99) >> "+nData);

        int digit_ten = nData / 10;
        int digit_one = nData % 10;
        if(digit_ten == digit_one){
            System.out.println("Yes! The digits of 10 and the digits of 1 are the same.");
        } else {
            System.out.println("No! The digits of 10 and the digits of 1 are the different.");            
        }

        sc.close();
        
    }
}
