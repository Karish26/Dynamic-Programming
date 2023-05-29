import java.util.*;
public class Triangle 
{
    public int findMax(int array[][])
    {
        int dp[][] = new int[array.length][array.length];
        int max=0;
        dp[0][0]=array[0][0];
        System.out.println(dp[0][0]);
        for(int i=1;i<array.length;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                
                if(j==0)
                {
                    dp[i][j]=array[i][j]+dp[i-1][j];
                }
                else
                if(i==j)
                {
                    dp[i][j]=array[i][j]+dp[i-1][j-1];
                }
                else 
                if(i!=j)
                {
                    if(dp[i-1][j-1]>dp[i-1][j])
                    {
                        dp[i][j]=dp[i-1][j-1]+array[i][j];
                    }
                    else 
                    {
                        dp[i][j]=dp[i-1][j]+array[i][j];
                    }
                }
                System.out.print(dp[i][j]+" ");
                
            }
            System.out.println();
        }     
        return Arrays.stream(dp[array.length-1]).max().getAsInt();
    }
    public static void main(String[] args)
    {
        int array[][] = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        Triangle t = new Triangle();
        System.out.println(t.findMax(array));
    }
    
}
