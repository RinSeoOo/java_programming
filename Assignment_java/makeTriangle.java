
import java.util.Scanner;

public class makeTriangle {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Input 3 Integers >> "+a+" "+b+" "+c);
        
        int max = a, other = 0;
        if(max < b){
            max = b;
            other = a + c;
            if(max < c){
                max = c;
                other = a + b;
            }
        } else {
            max = a;
            other = b + c;
        }

        if(other > max){
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
        sc.close();
    }
}
