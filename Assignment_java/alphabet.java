import java.util.Scanner;

public class alphabet {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a lowercase alphabet >> ");
        char alph = sc.next().charAt(0);
        // a ~ z : 97 ~ 122
        for(int i=alph;i>=97;--i){
            for(int j=97;j<=i;++j){
                System.out.print((char)j);
            }
            System.out.print("\n");
        }

        sc.close();

    }
}
