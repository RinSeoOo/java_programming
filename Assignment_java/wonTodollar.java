package Assignment_java;

import java.util.Scanner;

public class wonTodollar {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        // INPUT KRW >> 3300;
        // 3300 KRW is 3.0 USD -> 1 USD = 1100 KRW;
        int krw = sc.nextInt();
        System.out.println("INPUT KRW >> "+krw);
        double usd = Math.round( (krw / 1100.0) * 10) / 10.0;
        System.out.println(krw+" KRW is "+usd+" USD");

        sc.close();
    }
}
