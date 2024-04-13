package Assignment_java;

import java.util.Scanner;


public class PhoneBook {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // get number of person
        System.out.print("Nummber of person : ");
        int person = sc.nextInt();
        
        Phone[] phone = new Phone[person];

        for(int i=0;i<phone.length + 1;i++){
            System.out.println("Input name & phone number >> ");
            String in = sc.nextLine();
            phone[i] = new Phone(in);
        }

        while(true){         
            String command = "";   
            System.out.print("Search >> ");
            for(int i=0;i<phone.length;++i){
                if(command == phone[i].name){
                    System.out.println(phone[i].tel);
                    break;
                }                
            }
            if (command == "quit") break;
            else System.out.println("Not found");
        }
        sc.close();
    }
}
