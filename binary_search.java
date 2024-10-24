public class binary_search
{
    static int binarySearch(int[] num,int target)
    {
        int i=0,j=num.length-1;
        while(i<=j)
        {
            int m=i+(j-i)/2;
            if(num[m]<target)
            i=m+1;
            else if(num[m]>target)
            j=m-1;
            else
            return m;
        }
        return -1;
    }
    static int binarySearchL(int[] num,int target)
    {
        int i=0,j=num.length;
        while(i<j)
        {
            int m=i+(j-i)/2;
            if(num[m]<target){
            i=m+1;
            }
            else if(num[m]>target){
            j=m;
            }
            else{
            return m;
            }
        }
        return -1;
    }
        public static void main(String[] args)
        {
            int target=97;
            int[] num={1,2,3,4,7,8,9,11,34,97};
            int index=binarySearch(num,target);
            System.out.println("Index of target:"+index);
            index=binarySearchL(num,target);
            System.out.println("Index of target:"+index);
        }
}
