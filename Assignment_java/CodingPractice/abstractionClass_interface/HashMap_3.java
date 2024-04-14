package CodingPractice.abstractionClass_interface;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nation & population (Ex: Korea 5000)");
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        String nation;
        int pop;
        while(true){
            System.out.print("Nation & population >> ");
            nation = sc.next();
            if(nation.equals("stop") == true) {
                System.out.println("Input is done");
                break;
            }
            pop = sc.nextInt();
            hm.put(nation, pop);            
        }

        while(true){
            System.out.print("Search population of ");
            nation = sc.next();
            if(hm.containsKey(nation) == true) System.out.println("Population of "+nation+" is "+hm.get(nation));
            else if(hm.containsKey(nation) != true){
                if(nation.equals("quit")) {
                    System.out.println("Search population of exit");
                    break;
                }
                System.out.println("Cannot find "+nation);
            }
        }
        
        sc.close();
    }
}
