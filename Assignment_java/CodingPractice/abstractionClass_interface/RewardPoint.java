package CodingPractice.abstractionClass_interface;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class RewardPoint{
    static Scanner sc;
    static{
        sc = new Scanner(System.in);
    }
    
    public static void main(String[] args){
        System.out.println("** REWARD Management System **");
        HashMap<String, Integer> hmMan = new HashMap<>();
        while(true){
            System.out.print("Enter name & reward point >> ");
            String name = sc.next();
            if(name.equals("exit")) break;
            int pt = sc.nextInt();
            if(hmMan.containsKey(name)){
                hmMan.put(name, hmMan.get(name) + pt);
            }
            else {
                hmMan.put(name, pt);
            }
            
            Set<String> set = hmMan.keySet();
            for(String key : set){
                System.out.print("("+key+","+hmMan.get(key)+") ");
            }
            System.out.println();
        }
    }
}