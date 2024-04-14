
import java.util.Scanner;

public class multi3 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 10 positive integers >> ");
        int arr[];
        arr = new int[10];

        for(int i=0;i<10;++i){
            arr[i] = sc.nextInt();
        }

        System.out.print("Multiples of 3 :");
        for(int i=0;i<10;++i){
            if(arr[i] % 3 == 0){
                System.out.print(" "+arr[i]);
            }
        }

        sc.close();
    }
}
