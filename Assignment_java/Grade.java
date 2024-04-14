
import java.util.Scanner;

public class Grade {
    public int math;
    public int science;
    public int english;
    public int avg;

    public Grade(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public int average(){
        avg = (int)((math + science + english) / 3.0);
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input scores in order of Math., Science and English >> ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("Average : "+me.average());
        sc.close();
    }
}
