public class BinarySearch{
    public static void main(String[] args)
    {
        int[] arr={7,3,10,23,63,97,101};
        int target=10;
        int val=binarySearch(arr,target);
        System.out.println(val);
    }
        public static int binarySearch(int[] arr,int target){
            int start=0;
            int end=arr.length-1;
            boolean isAsc=arr[start]<arr[end];
            while(start<=end)
            {
                int mid=start+(start-start)/2;
                if(arr[mid]==target){
                    return mid;
                    }
                    if(isAsc)
                    {
                    if(target<arr[mid]){
                    end=mid-1;
                    }else
                    {
                    if(target>arr[mid]){
                        start=mid+1;
                    }
                    else
                    {
                        if(target>arr[mid]){
                        end=mid-1;
                        }else{
                        start=mid+1;
                        }
                    }
                }return -1;
            }
        }
    }
}

