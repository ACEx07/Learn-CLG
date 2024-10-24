import java.util.Scanner;

public class LinearSearch1{
    public static void main(String[] args)
    {
        int i, num, pos=0;
        int [] arr = new int[10];
        Scanner se = new Scanner(System.in);

        System.out.print("ENter 10 Elements:");
        for(i=0;i<10;i++)
        arr[i]=se.nextInt();
        System.out.print("ENter an Element to search:");
        num=se.nextInt();
        for(i=0;i<10;i++)
        {
            if(num==arr[i])
            {
                pos=i+1;
                break;
            }
        }
        if(pos==0)
        System.out.println("\nElements not Found");
        else
        System.out.println("\nThe element position:"+pos);
    }
}