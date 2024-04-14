package CodingPractice.abstractionClass_interface;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class studentsGrade_5 {    
    ArrayList<String> stud = new ArrayList<>();
    ArrayList<String> maj = new ArrayList<>();
    ArrayList<String> idd = new ArrayList<>();
    ArrayList<Double> gra = new ArrayList<>();
    private void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name, major, id and average of grade.");
        for(int i=0;i<4;i++){
            System.out.print(">> ");
            String text = sc.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String id = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());
            stud.add(name);
            maj.add(department);
            idd.add(id);
            gra.add(grade);
        }
        sc.close();
    }

    private void printAll(){
        for(int i=0;i<stud.size();i++){
            System.out.println("-------------------------------");
            System.out.println("Name : "+stud.get(i));
            System.out.println("Major : "+maj.get(i));
            System.out.println("ID : "+idd.get(i));
            System.out.println("Avg. Grade : "+gra.get(i));
            System.out.println("-------------------------------");
        }
    }

    private void processQuery(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Student name >> ");
            String students = sc.next();
            if(students.equals("exit") == true) break;
            if(stud.indexOf(students) == -1) continue;
            else if(stud.indexOf(students) != -1){
                int idx = stud.indexOf(students);
                System.out.println(stud.get(idx) + ", "+maj.get(idx) + ", "+idd.get(idx) + ", "+gra.get(idx));
            }
            

        }
        sc.close();
    }

    public static void main(String[] args){
        studentsGrade_5 sg = new studentsGrade_5();
        sg.read();
        sg.printAll();
        sg.processQuery();
    }
}
