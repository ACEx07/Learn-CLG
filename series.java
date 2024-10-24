import java.util.*;
public class series {
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int x=a.nextInt();
        int fact=1,i,sum=1;
        for(i=1;i<n;i++)
        {
            fact=fact*i;
            sum+=(Math.pow(x,i)/fact);


        }
        System.out.print(sum);
    }

}
