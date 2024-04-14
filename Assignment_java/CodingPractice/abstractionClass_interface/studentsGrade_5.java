package CodingPractice.abstractionClass_interface;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Student{
    String name;
    String major;
    String id;
    double avgrade;
    protected Student(String name, String major, String id, double avgrade){
        this.name = name;
        this.major = major;
        this.id = id;
        this.avgrade = avgrade;
    }

    protected String getName(){
        return name;
    }
    protected String getMajor(){
        return major;
    }
    protected String getID(){
        return id;
    }
    protected double getAvgGrade(){
        return avgrade;
    }
}

public class studentsGrade_5 {    
    static Scanner sc;
    static{
        sc = new Scanner(System.in);
    }

    ArrayList<Student> students = new ArrayList<>();

    private void read(){        
        System.out.println("Enter student name, major, id and average of grade.");
        for(int i=0;i<4;i++){
            System.out.print(">> ");
            String text = sc.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String id = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());
            students.add(new Student(name, department, id, grade));
            
        }
    }

    private void printAll(){
        for(Student student : students){
            System.out.println("-------------------------------");
            System.out.println("Name : "+student.getName());
            System.out.println("Major : "+student.getMajor());
            System.out.println("ID : "+student.getID());
            System.out.println("Avg. Grade : "+ student.getAvgGrade());
            System.out.println("-------------------------------");
        }
    }

    private void processQuery(){
        while (true) {
            System.out.print("Student name >> ");
            String studentName = "";
            studentName = sc.next();
            if(studentName.equals("exit") == true) break;

            for(Student stud : students){
                if(stud.getName().equals(studentName)){
                    System.out.println(stud.getName()+", "+stud.getMajor()+", "+stud.getID()+", "+stud.getAvgGrade());
                }
            }

        }
    }

    public static void main(String[] args){
        studentsGrade_5 sg = new studentsGrade_5();
        sg.read();
        sg.printAll();
        sg.processQuery();
    }
}
