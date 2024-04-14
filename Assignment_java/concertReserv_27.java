import java.util.Scanner;
// import java.lang.Integer;

class concertRe{
    public String[][] sheet = new String[3][10];
    public String[] level = {"S", "A", "B"};
    public String name;
    public int id;

    // sheet 표 생성
    public concertRe(){
        for(int i=0;i<10;i++){
            sheet[0][i] = (i+1) + "";
            sheet[1][i] = (i+1) + "";
            sheet[2][i] = (i+1) + "";
        }
    }

    public void showClass(int classNumber){
        System.out.print("Class "+level[classNumber-1]+" >>");
        for(int i=0;i<10;i++){
            System.out.print(" -"+sheet[classNumber-1][i]+"- ");
        }
        System.out.println();
    }

    public boolean checkName(String name){
        try {
            Integer.parseInt(name);
            return true;
          } catch (NumberFormatException ex) {
            return false;
          }
    }


    //현재 자리에 예약이 있는 경우
    public int checkReserveNow(int n, int id){
        int check = 1;
        String num = (id+1)+"";
        if(num.equals(sheet[n][id])){
            check = 0;  // 예약 없음
        } else {
            check = 1;      
        }
        return check;
    }

    // name에 대한 예약이 있는 경우
    public int checkReserve(String name){
        int check = 1;
        outerloop:
        for(int i=0;i<3;i++){
            for(int k=0;k<10;k++){
                if(name.equals(sheet[i][k])) {
                    check = 0; // 만약 예약 있으면 0
                    break outerloop;
                }   // 예약 없으면 1
            }
        }

        return check;
    }

    public void reserve(String name, int sheetNumber, int id){
        this.name = name;
        this.id = id;
        sheet[sheetNumber-1][id-1] = name;  // 예약 완료
        System.out.println(level[sheetNumber-1]+" class sheet #"+id+" reserved for " + sheet[sheetNumber-1][id-1]);
    }

    public void cancel(String name, int classNumber){
        String str;
        for(int i=0;i<10;i++){
            if(name.equals(sheet[classNumber-1][i])){
                sheet[classNumber-1][i] = (i+1)+"";
                str = "Reservation for "+name+", Class "+level[classNumber-1]+" #"+(i+1)+" cancelled.";
                // System.out.println("Reservation for "+name+", Class "+level[classNumber-1]+" #"+(i+1)+" cancelled.");
            }
            else{
                str = "no reservation in this class";
            }
            System.out.println(str);
        }
    }

    // status 출력
    public void status(){
        for(int i=0;i<3;i++){
            System.out.print("Class "+level[i]+">>");
            for(int k=0;k<10;k++){
                System.out.print(" -"+sheet[i][k]+"-");
            }
            System.out.println();
        }
    }
}

public class concertReserv_27{
    static Scanner sc;
    static{
        sc = new Scanner(System.in);
    }

    

    public static void main(String[] args){
        System.out.println("DKU Concert hall reservation system");
        concertRe sh = new concertRe(); // class sheet 초기화

        int cmd = 0;
        while(true){
            System.out.print("1 : Reservation\n2 : Status\n3 : Cancel\n4 : Quit\n>>> ");
            cmd = sc.nextInt();
            if(cmd == 4) break;
            else if(cmd == 1){  // reservaion
                System.out.print("Class S(1), A(2), B(3) >> ");
                int classNumber = sc.nextInt();                
                if(classNumber == 1 || classNumber == 2 || classNumber == 3){
                    sh.showClass(classNumber);
                    System.out.print("Name >> ");
                    String name = sc.next();
                    if(sh.checkReserve(name) == 0) {
                        System.out.println(name+"'s reservation is alreay exist");
                    }
                    else{
                        System.out.print("Sheet number >> ");
                        int id = sc.nextInt();
                        // 만약 sheet number에 대한 예약이 있다면??
                        if(sh.checkReserveNow(classNumber-1, id-1) == 1) {
                            System.out.println("There is alreay exist reservation : "+sh.sheet[classNumber-1][id-1]);
                            continue;
                        }  
                        else {
                            if(id > 10 || id < 1) continue;
                            else sh.reserve(name, classNumber, id);
                        }
                    }
                }
                else {    // 만약 class number 잘못 입력했을 경우                
                    System.out.println("Class Number is wrong");
                    continue;
                }
            }
            else if(cmd == 2){  // satus
                sh.status();
            }
            else if(cmd == 3){  // cancel
                System.out.print("Class S(1), A(2), B(3) >> ");
                int classNumber = sc.nextInt();                
                if(classNumber == 1 || classNumber == 2 || classNumber == 3){
                    sh.showClass(classNumber);
                    System.out.print("Name >> ");
                    String name = sc.next();
                    // 만약 name에 대한 예약이 있다면??
                    if(sh.checkReserve(name) == 0) {
                        sh.cancel(name, classNumber);
                    }
                    else {
                        System.out.println("no reservation to "+name);
                        continue;
                    }
                }
                else {    // 만약 class number 잘못 입력했을 경우                
                    System.out.println("Class Number is wrong");
                    continue;
                }
            }
            else {
                continue;
            }
        }
    }
}