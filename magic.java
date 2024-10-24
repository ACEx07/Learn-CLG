import java.util.*;
public class magic{
    public static void main(String args[]){
        int num,sum=0;
        Scanner val=new Scanner(System.in);
        System.out.print("ENter the number:");
        num=val.nextInt();
        val.close();
        while(num>9){
         }
          while(num!=0){
          sum+=num%10;
          num/=10;
        num=sum;
      }
    }
  }