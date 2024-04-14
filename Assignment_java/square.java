
import java.util.Scanner;

public class square {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Input (x, y) >> "+x+" "+y);
        
        if(x > 100 && x < 200){
            if(y > 100 && y < 200){
                System.out.println("Point ("+x+", "+y+") is in the rectangle.");
            } 
        }
        if(y < 100 || y > 200){
            if (x < 100 || x > 200){
                System.out.println("Point ("+x+", "+y+") is not in the rectangle.");
            }
        }
        sc.close();
    }
}
