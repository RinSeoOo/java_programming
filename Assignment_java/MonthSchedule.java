package Assignment_java;

import java.util.Scanner;

class day{
    private String todo;
    public void set(String todo) {
        this.todo = todo;
    }

    public String get() {
        return todo;
    }

    public void show() {
        if(todo == null) System.out.println("Nothing to do");
        else System.out.println(todo);
    }
}

public class MonthSchedule {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Monthly schedule management system");

        day d[] = new day[31];
        int input = 0, date = 0;
        while(true){
            System.out.print("Todo (Input:1, Show:2, Quit:3) >> ");
            input = sc.nextInt();
            if(input == 1 || input == 2){
                System.out.print("Date (1~30) : ");
                 date = sc.nextInt();
                if(input == 1){
                    System.out.print("Todo (Enter string withdout space) ? ");
                    String todolist = sc.next();
                    d[date - 1] = new day();
                    d[date - 1].set(todolist);
                }
                if(input == 2){             
                    d[date - 1].get();       
                    d[date - 1].show();
                }
            }
            else if(input == 3){
                System.out.println("Quit program.");
                break;
            }
            
        }
        sc.close();
    }
}
