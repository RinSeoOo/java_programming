package CodingPractice.abstractionClass_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class avg_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double avg = 0;
        ArrayList<Character> al = new ArrayList<>();
        System.out.print("Enter grades of 6 students (A/B/C/D/F) >> ");
        for(int i=0;i<6;++i){
            char st = sc.next().charAt(0);
            al.add(st);
        }

        for(int i=0;i<al.size();i++){
            char st = al.get(i);
            if(st == 'A') avg += 4.0;
            else if(st == 'B') avg += 3.0;
            else if(st == 'C') avg += 2.0;
            else if(st == 'D') avg += 1.0;
            else if(st == 'F') avg += 0.0;
            else {
                avg = -1;
                break;
            }
        }
        if(avg != -1){
            avg /= 6;
            System.out.println("Average : "+avg);
        }
        else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
