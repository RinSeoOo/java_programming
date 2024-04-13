package Assignment_java;

import java.util.Scanner;

public class game_369 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Input integer(1~99) >> "+num);

        int one = num % 10;
        int ten = num / 10;
        int both = 0;
        if(one == 3 || one == 6 || one == 9){
            System.out.print("Clap");
            ++both;
        }

        if(ten == 3 || ten == 6 || ten == 9){
            if(both == 1) System.out.print(", ");
            System.out.println("Clap");
        }
        sc.close();
    }
}
