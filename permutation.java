import java.util.*;

public class permutation
{
    public static void backtrack(List<Integer>state,int[] choices,boolean[] selected,List<List<Integer>> res)
    {
        if (state.size()==choices.length)
        {
            res.add(new ArrayList<Integer>(state));
            return;
        }
        for(int i=0;i<choices.length;i++)
        {
            int choice=choices[i];
            if(!selected[i])
            {
                selected[i]=true;
                state.add(choice);
                backtrack(state,choices,selected,res);
                selected[i]=false;
                state.remove(state.size()-1);
            }
        }
    }
    static List<List<Integer>> permutation(int[] nums)
    {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        backtrack(new ArrayList<Integer>(), nums, new boolean[nums.length], res);
        return res;
    }

    public static void main(String[] args)
    {
        int[] nums = { 1, 2, 3 };

        List<List<Integer>> res = permutation(nums);

        System.out.println("Input array nums = " + Arrays.toString(nums));
        System.out.println("All permutations res = " + res);
    }
}