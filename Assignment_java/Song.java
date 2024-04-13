package Assignment_java;

public class Song {
    public String title;
    public String artist;
    public int year;
    public String country;

    public Song(String title, String artist, int year, String coutnry){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = coutnry;
    }

    public void show(){
        System.out.println(title+" by "+artist+" from "+country+", "+year);
    }

    public static void main(String[] args){
        Song song = new Song("Dynamite", "BTS", 2021, "Korea");
        song.show();
    }
}

