import java.util.Scanner;

public class arvg {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        double avg = 0.0;
        double arr[] = new double[10];

        System.out.print("Random numbers :");
        for(int i=0;i<10;++i){
            arr[i] = (int)(Math.random()*10 + 1);
            System.out.print(" " + (int)arr[i]);
            avg += arr[i];
        }
        System.out.println();

        avg /= 10.0;
        System.out.println("Average : "+ Math.round(avg * 10.0) / 10.0);

        sc.close();
    }
}
