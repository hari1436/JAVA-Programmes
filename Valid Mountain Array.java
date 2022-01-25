class Solution {
    public boolean validMountainArray(int[] a) {
        int len=a.length;
        if(len<3)                   // Checking the first condition for valid mountain aray
            return false;
        
        int i=0;
        while(i<len)                 // checking for stricly increasing part of mountain
        {
            if(i==len-1)
                return false;
            if(a[i]>=a[i+1])
                break;
            
            i++;
        }
        if(i==0)
            return false;
        while(i<len-1)              // checking for strictly decreasing part of mountain
        {
            if(a[i]<=a[i+1])
                return false;
            i++;
        }
        
        return true;
    }
}
