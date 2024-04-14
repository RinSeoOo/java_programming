
import java.util.Scanner;
public class reversePiramid {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input integer >> ");
        int star;
        star = sc.nextInt();

        for(int i=0;i<star;++i){
            for(int j=i;j<star;++j){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
