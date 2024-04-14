package CodingPractice.abstractionClass_interface;

import java.util.Scanner;
import java.util.Vector;

public class maximum_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int integer = 0, max = -1;
        Vector <Integer> v = new Vector<Integer>();

        System.out.print("Enter integer(-1 to quit) >> ");
        while(integer != -1){
            integer = sc.nextInt();
            v.add(integer);
        }
        for(int i=0;i<v.size();i++){
            int n = v.get(i);
            if(max < n) max = n;
        }
        System.out.println("Maximum number is "+max);
        
        sc.close();
    }
}
