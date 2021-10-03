/* 
Since the substring need not be contiguos we can compare or check the characters between 2 strings using a matrix. using dynamic programming bottom up approach since we need to store the last answer

*/
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
       // int ans=0;
        char a[]=text1.toCharArray();
        char b[]=text2.toCharArray();
        for(int i=1;i<text1.length()+1;i++)
        {
            for(int j=1;j<text2.length()+1;j++)
            {
                if(a[i-1]==b[j-1])
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=(int)Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
