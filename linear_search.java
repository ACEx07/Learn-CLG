import java.utils.*;
public class linear_search{
    public static linearSearchArray(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            return i;
        }
    }
    public static ListNode linearSearchLinkedList(ListNode head,int target){
        while(head!=null){
            if(head.val==target)
            return head;
            head=head.next;
        }
        return null;
    }
    public static void main(String[] args){
        int target=5;
        int[] nums={1,2,8,4,5,9,7,3,6,10};
        int index=linearSearchArray(nums,target);
        System.out.println("Index Element 5:"+index);
        ListNode head=ListNode.arrToLinkedList(nums);
        ListNode node=linearSearchLinkedList(head,target);
        System.out.println("val:"+node);
    }
}