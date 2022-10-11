package ex04taubautista;

public class myClass {
    private String name, faveMilktea;
    private int age;
    private double grade;
    Song faveSong;
    
    public myClass(String n, int a, String milktea, double gwa, Song fsong) {
        name = n;
        age = a;
        faveMilktea = milktea;
        grade = gwa;
        faveSong = fsong;
    }
    
    public String getPersonName(){
        return name;
    }
    
    public String getMilktea(){
        return faveMilktea;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getGrade(){
        return grade;
    }
    
    public Song getSong(){
        return faveSong;
    }
}
