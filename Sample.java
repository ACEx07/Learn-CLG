abstract class Member{
    abstract void Welcome();
}
class Student extends Member{
    void Welcome(){
        System.out.println("Welcome student");
    }
}
class Teacher extends Member{
    void Welcome(){
        System.out.println("Welcome Teacher");
    }
}
public class Sample{
    public static void main(String[] args){
        Member stu = new Student();
        Member tea = new Teacher();
        stu.Welcome();
        tea.Welcome();
    }
}