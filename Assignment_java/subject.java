package Assignment_java;

import java.util.Scanner;

public class subject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String course[] = {"Java", "C++", "HTML", "Kotlin", "Python"};
        int score[] = {95, 88, 76, 62, 55};

        String inputSub = "START";
        int n = 0;
        while(true){
            n = 0;
            System.out.print("Subject >> ");
            inputSub = sc.next();
            for(int i=0;i<course.length;++i){
                if(course[i].equals(inputSub)){
                    n = score[i];
                    break;
                }
            }
            if(n != 0){
                System.out.println("Score is " + n);
            }
            else {
                if(inputSub.equals("Quit")) break;
                System.out.println("Invalid subject");
            }
        }

        sc.close();
    }
}
