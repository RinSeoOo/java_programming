
import java.util.Scanner;

public class weather {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input month (1~12) >> ");
        int num = sc.nextInt();

        if(num==2 || num == 12 || num == 1){
            System.out.println("Winter");
        }
        else if(num >= 9 && num <= 11){
            System.out.println("Autumn");
        }
        else if(num >= 6 && num <= 8){
            System.out.println("Summer");
        }
        else if(num >= 3 && num <= 5){
            System.out.println("Spring");
        }
        else{
            System.out.println("Invalid");
        }

        sc.close();
    }
}
