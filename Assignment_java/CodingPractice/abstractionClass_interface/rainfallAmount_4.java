package CodingPractice.abstractionClass_interface;

import java.util.Scanner;
import java.util.Vector;

public class rainfallAmount_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int rain;
        while(true){
            int avg = 0;
            System.out.print("Enter amount of rainfall (0 to quit) >> ");
            rain = sc.nextInt();
            if(rain == 0) break;

            v.add(rain);
            for(Integer i : v){
                System.out.print(i+" ");
                avg += i;
            }
            avg /= v.size();
            System.out.println("\nCurrent Average : "+avg);
        }
        sc.close();
    }
}
