import java.io.*;

class Student{
    String name="gautham";
    String dept="mca";
    String college="RTC";
}

public class BioData{
    public static void main(String[] args){
        Student s= new Student();
        System.out.println("Name:"+ s.name);
        System.out.println("Dept:"+ s.dept);
        System.out.println("CLG:"+ s.college);

    }
}