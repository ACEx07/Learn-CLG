public class EmpArg
{
    public static int countArg(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else if(n==2)
        {
            return 2;
        }
        int [] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) 
    {
    int n=4;
    System.out.println("No.of arrangements:"+countArg(n));
    n=3;
    System.out.println("No.of arrangements:"+countArg(n));
    }
}