
import java.util.Scanner;

public class getInt {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements : ");
        int getNum = sc.nextInt();
        if(getNum > 100){
            System.out.println("Number is lager than 100");
        } else {
            int arr[] = new int[getNum];
            for(int i=0;i<getNum;++i){
                arr[i] = (int)(Math.random()*100 + 1);
                System.out.print(arr[i] + " ");
                if((i+1) % 10 == 0) System.out.println();
            }
        }

        sc.close();
    }
}
