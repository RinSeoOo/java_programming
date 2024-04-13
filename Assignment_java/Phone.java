package Assignment_java;

public class Phone {
    public String input;
    public String name;
    public String tel;

    public Phone(String in){
        input = in;
        String[] stChange1 = input.split("\\s");
        name = stChange1[0];
        tel = stChange1[1];
    }
}
