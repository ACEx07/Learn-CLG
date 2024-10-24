public class EmpGame
{
    public static int countArg(int n)
    {
        if(n%2!=0)
        {
            return 1;
        }
        int [] dp=new int [n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args)
    {
        int n1=3;
        System.out.println("No.of arrangements for "+n1+" employees:"+countArg(n1));
        int n2=4;
        System.out.println("No.of arrangements for "+n2+" employees:"+countArg(n2));
    }
}