package CodingPractice.abstractionClass_interface;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.HashMap;

class Location{
    protected String name;
    protected double latit;
    protected double longit;
    public Location(String name, double latit, double longit){
        this.name = name;
        this.latit = latit;
        this.longit = longit;
    }
    
    public String getCity(){
        return name;
    }
    public double getLatit(){
        return latit;
    }
    public double getLongit(){
        return longit;
    }
}


public class city_7{
    static Scanner sc;
    static {
        sc = new Scanner(System.in);
    }
    
    HashMap<String, Location> hmCity = new HashMap<>();
    protected void readCity(){        
        System.out.println("Enter City name, latitude, longitude");
        for(int i=0;i<4;i++){
            System.out.print(">> ");
            String text = sc.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            double latit = Double.parseDouble(st.nextToken().trim());
            double longit = Double.parseDouble(st.nextToken().trim());
            hmCity.put(name, new Location(name, latit, longit));
        }
    }


    protected void printAllCity(){
        for(String key : hmCity.keySet()){
            Location cit = hmCity.get(key);
            System.out.println(cit.getCity()+"\t"+cit.getLatit()+"\t"+cit.getLongit());
        }
    }
    
    private void processQueryCity(){
        while(true){
            System.out.print("City name >> ");
            String citname = sc.next();
            if(citname.equals("exit")) break;
            if(hmCity.containsKey(citname)){
                System.out.print(hmCity.get(citname).getCity());
                System.out.print("\t"+hmCity.get(citname).getLatit());
                System.out.println("\t"+hmCity.get(citname).getLongit());
            }
            else {
                System.out.println("Location of "+citname+"is unknown");
            }
        }
    }
    
    public static void main(String[] args){
        city_7 printSud = new city_7();
        printSud.readCity();
        printSud.printAllCity();
        printSud.processQueryCity();
    }
}