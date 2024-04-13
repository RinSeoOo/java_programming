package Assignment_java;

import java.util.Scanner;

public class circleCenter {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int x1, y1, rad1;
        int x2, y2, rad2;
        System.out.print("Input center and radius of 1st circle >> ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        rad1 = sc.nextInt();
        
        System.out.print("Input center and radius of 2nd circle >> ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        rad2 = sc.nextInt();

        double centcent = Math.pow(x2-x1, 2.0) + Math.pow(y2-y1, 2.0);
        centcent = Math.sqrt(centcent);
        double rTor = rad1 + rad2;

        if(centcent > rTor) {
            System.out.println("Two circles are not overlapped");
        } else {
            System.out.println("Two circles are overlapped");

        }
        sc.close();
    }
}
