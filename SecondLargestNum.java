public class SecondLargestNum
{
    public static void main(String args[])
    {
        int temp,size;
        int a[]={10,20,30,40,50,60};
        size=a.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second largest num:"+a[size-2]);
    }
}