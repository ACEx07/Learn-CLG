import java.util.*;
public class Addition{
    public static void main(String[] args){
        int a,b,c;
        System.out.println("Enter value a:");
        System.out.println("Enter value b:");
        Scanner add=new Scanner(System.in);
        a=add.nextInt();
        b=add.nextInt();
        c=a+b;
        System.out.println("Addition:"+c);
    }
}