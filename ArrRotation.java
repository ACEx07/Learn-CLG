import java.util.*;
class ArrRotation
{
    public static void rotateArray(int[] a,int d)
    {
        int n=a.length;
        d=d%n;
        int[]temp=new int[n];
        int k=0;
        for(int i=d;i<n;i++){
            temp[k++]=a[i];
        }
        for(int i=0;i<n;i++){
            a[i]=temp[i];
        }
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9};
        int d=2;
        rotateArray(a,d);
        System.out.println(Arrays.toString(a));
    }
}