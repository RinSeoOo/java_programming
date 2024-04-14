package CodingPractice.abstractionClass_interface;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;

class Student{
    protected String name;
    protected String major;
    protected String id;
    protected double score;

    public Student(String name, String major, String id, double score){
        this.name = name;
        this.major = major;
        this.id = id;
        this.score = score;
    }
    public String Name(){
        return name;
    }
    public String Major(){
        return major;
    }
    public String Id(){
        return id;
    }
    public double Score(){
        return score;
    }
}

public class studentsGrade_6{
    static Scanner sc;
    static {
        sc = new Scanner(System.in);
    }

    HashMap<String, Student> hm = new HashMap<>();

    protected void read(){        
        System.out.println("Enter student name, major, id and average of grade.");
        for(int i=0;i<4;i++){
            System.out.print(">> ");
            String text = sc.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            String department = st.nextToken().trim();
            String id = st.nextToken().trim();
            double grade = Double.parseDouble(st.nextToken().trim());
            hm.put(name, new Student(name, department, id, grade));
        }
    }

    private void printAll(){
        for(String key : hm.keySet()) {
            Student student = hm.get(key);
            System.out.println("Name : "+ student.Name());
            System.out.println("Major : "+student.Major());
            System.out.println("ID : "+student.Id());
            System.out.println("Avg. Grade : "+student.Score());
        }

    }

    private void processQuery(){
        String getStudentName;
        while(true){
            System.out.print("Student name >> ");
            getStudentName = sc.next();
            if(getStudentName.equals("exit")) break;

            if(hm.containsKey(getStudentName)){
                System.out.println((String) hm.get(getStudentName).Name()+", "+(String) hm.get(getStudentName).Major()+", "+(String) hm.get(getStudentName).Id()+", "+(double) hm.get(getStudentName).Score());
            }
            else continue;
        }
    }
    public static void main(String[] args){
        studentsGrade_6 printSud = new studentsGrade_6();
        printSud.read();
        printSud.printAll();
        printSud.processQuery();
    }
}