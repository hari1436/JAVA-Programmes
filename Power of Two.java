class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n%2!=0 && n!=1 || n<0)
            return false;
        
        String s=Integer.toBinaryString(n);
       // int i=0;
        int c=0;
        for(int j=s.length()-1;j>=0;j--)
        {
            if(s.charAt(j)=='1')
            {c++;}
            
        
                
        }
        
         if(c==1)
            return true;
        else
            return false;
        
    }
}
