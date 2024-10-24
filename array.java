import java.util.*;
public class array {
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        int arr[][]=new int [n][n];
        int i,j,k,start,end,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=a.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(start=0,end=n-1;start<end;start++,end--)
        {
            for(k=0;k<n;k++)
            {
                temp=arr[start][k];
                arr[k][start]=arr[end][k];
                arr[end][k]=temp;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.print("\n");
        }

    }
    
}
