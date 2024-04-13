package Assignment_java;

import java.util.Scanner;

public class calculator {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        double n1, n2, ans;
        char op;
        System.out.print("Enter >> ");
        n1 = sc.nextDouble();
        op = sc.next().charAt(0);
        n2 = sc.nextDouble();

        switch (op){
            case '+':
            ans = n1 + n2;
            System.out.println(ans);
            break;

            case '-':
            ans = n1 - n2;
            System.out.println(ans);
            break;

            case '*':
            ans = n1 * n2;
            System.out.println(ans);
            break;

            case '/':
            if(n2 == 0){
                System.out.println("Divide by 0 error");
            } else {
                ans = n1 / n2;
                System.out.println(ans);
            }
            break;
        }
        
        sc.close();
    }
}
