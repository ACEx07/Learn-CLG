import java.util.*;
public class bubble_sort
{
    public static void bubbleSort1(int[] num)
    {
        for(int i=num.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if (num[j]>num[j+1])
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
    public static void bubbleSort(int[] num)
    {
        for(int i=num.length-1;i>0;i--){
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag)
            break;
        }
    }
    public static void main(String[] args)
    {
        int[] num={4,1,6,2,5,7,3};
        bubbleSort1(num);
        System.out.println("After num:"+Arrays.toString(num));
        int[] num1={4,1,6,2,5,7,3};
        bubbleSort(num1);
        System.out.println("After num1:"+Arrays.toString(num1));
    }
}