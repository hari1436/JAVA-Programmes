class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1="",w2="";
        for(int i=0;i<word1.length;i++)
        {
            w1+=word1[i];
        }
         for(int i=0;i<word2.length;i++)
        {
            w2+=word2[i];
        }
        if(w1.equals(w2))
            return true;
        else
            return false;
    }
}
// checking two strings are equal by traversing through each string array and concat it with separate String variable and compare it with equals method
// NOTE DONT USE CONCAT FUNCTION AS IT WILL INCREASE THE TIME COMPLEXITY BY 1MS
