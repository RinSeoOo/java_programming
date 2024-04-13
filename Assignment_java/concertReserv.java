// package Assignment_java;

// import java.util.Scanner;
// import java.lang.Integer;

// public class concertReserv {
//     public String[][] alph = new String[3][10];
//     public String name = "";
//     public int classNum = 0;
//     public String[] clsSAB = {"S", "A", "B"};

//     public concertReserv(){
//         // Class sheet 초기화 
//         for(int i=0;i<10;i++){
//             String x = (i+1) + "";
//             alph[0][i] = x;
//             alph[1][i] = x;
//             alph[2][i] = x;
//         }
//     }
    
//     public void reservationSheet(int classNum){
//         // reservation 좌석 출력
//         this.classNum = classNum;
//         if(classNum == 1 || classNum == 2 || classNum == 3){
//             System.out.print("Class "+clsSAB[classNum-1]+" >> ");
//             for(int i=0;i<10;i++){
//                 System.out.print(" -"+alph[classNum-1][i]+"-");
//             }
//         }
//         else {
//             System.out.print("[ERROR] Class of"+classNum+" is not exist");
//         }
//         System.out.println();
//     }

//     public boolean checkClass(){
//         /*
//          * resturn true - 예약 없음
//          * resturn false - 예약 존재
//          */
//         boolean tf = true;
//         for(int k=0;k<3;k++){
//             for(int i=0;i<10;i++){
//                 if(alph[k][i] == this.name){
//                     System.out.println(this.name+" reservation is exist");
//                     tf = false;
//                     break;
//                 }
//                 else {
//                     tf = true;
//                     break;
//                 }
//             }
//         }
//         return tf;
//     }

//     public void reserv(boolean tf, int num){
//         String str = "";
//         for(int i=0;i<10;i++){
//             int n = Integer.valueOf(alph[classNum-1][i]).intValue();
//             // String n = (i+1)+"";    // 1 2 3 4 5 6 7 8 9 10
//             if(n == i+1){   // 좌석에 숫자 쓰여짐
//                 //예약 완료
//                 alph[classNum-1][i] = this.name;
//                 str = clsSAB[classNum-1]+" class sheet #"+num+" resesrved for "+alph[classNum-1][i];
//                 break;
                
//             }
//             else {
//                 str = n + " is "+ alph[classNum-1][i]+" >> [ERROR] System is not working";
//             }
//         }
//         System.out.println(str);
//     }

//     public void status(){
//         for(int i=0;i<3;i++){
//             System.out.print("Class "+clsSAB[i]+" >> ");
//             for(int k=0;k<10;k++){
//                 System.out.print(" -"+alph[i][k]+"-");
//             }
//             System.out.println();
//         }
//     }

//     public void cancel(boolean whattf, int clsname){
//         // 3. Cancel
//         /*
//         * Class S, A, B >> choose
//         * Name >>
//         * if(exist) print("Reservation for "+name+", Class "+className+" #"+number+" cancelled");
//         * else if(no exist) print("already no exist");
//         */
//         if(whattf == true){ // 예약 존재

//             System.out.println(this.name+" reservation is already no exist");
//         }
//         else if(whattf == false) {
//             for(int i=0;i<3;i++){
//                 for(int k=0;k<10;k++){
//                     if(alph[i][k] == this.name){
//                         // int n = Integer.parseInt(alph[classNum-1][i]);
//                         int n = i+1;
//                         alph[i][k] = n+"";
//                         System.out.println("Reservation for "+this.name+", Class "+clsSAB[i]+" #"+n+" cancelled.");
//                         break;
//                     }
//                 }
//             }
//         }



//     }
    
    
//     public static void main(String[] args){
//         System.out.println("DK Concert hall reservation system");
//         Scanner sc = new Scanner(System.in);

//         int comd = 0;
//         concertReserv crv = new concertReserv();

//         while(comd != 4){
//             System.out.println("\n1 : Resesrvation");
//             System.out.println("2 : Status");
//             System.out.println("3 : Cancel");
//             System.out.println("4 : Quit");
//             System.out.print(">>> ");
//             comd = sc.nextInt();
//             if(comd == 1){

//                 // 1. reservation
//                 System.out.print("Class S(1), A(2), B(3) >> ");
//                 int classNum = sc.nextInt();
//                 if(classNum != 1 && classNum != 2 && classNum != 3){
//                     System.out.println("the number is no class.");
//                     continue;
//                 }
//                 crv.reservationSheet(classNum);

//                 System.out.print("Name >> ");
//                 crv.name = sc.next();
//                 boolean checkTF = crv.checkClass(); // checkClass() -> 없으면 true
//                 if(checkTF == false) continue;
//                 System.out.print("Sheet number >> ");
//                 int sheetNum = sc.nextInt();
//                 checkTF = crv.checkClass();
//                 if(checkTF == true) crv.reserv(checkTF, sheetNum);
//                 /*
//                 * Class S, A, B >> choose
//                 * Name >>
//                 * Sheet number >>
//                 * if(there no person) print(className+"class sheet #"+number+" reserved for "+name); 배열에 저장;
//                 * else if(no sheet number) print("[ERROR] no exist Sheet number");
//                 * else if(already exist) print(name+"Reservation already exist");
//                 */
//             }
            
//             else if(comd == 2){
//                 crv.status();
//                 // 2. Status
//                 /*
//                 * Class S, A, B 전체 배열 보여줌
//                 */
//             }

//             else if(comd == 3){
//                 // 3. Cancel
//                 /*
//                 * Class S, A, B >> choose
//                 * Name >>
//                 * if(exist) print("Reservation for "+name+", Class "+className+" #"+number+" cancelled");
//                 * else if(no exist) print("already no exist");
//                 */
//                 System.out.print("Class S(1), A(2), B(3) >> ");
//                 int clName = sc.nextInt();
//                 System.out.print("Name >> ");
//                 crv.name = sc.next();

//                 boolean checkTF = crv.checkClass();
//                 crv.cancel(checkTF, clName-1);
//             }
//             else if(comd == 4) break;
//             else {
//                 System.out.println(comd+" is not the command");
//             }

//         }
//         sc.close();
//     }
// }
