class Solution {
    public void sortColors(int[] nums) {
        int zc=0,oc=0,tc=0;
        for(int i:nums){
            if(i==0)
                zc++;
            else if(i==1)
                oc++;
            else
                tc++;
                
                
            }
        int i,j;
        for(i=0;i<zc;i++)
        {
            nums[i]=0;
        }
        for(;oc>0;oc--)
        {
            nums[i++]=1;
        }
        for(;tc>0;tc--)
        {
            nums[i++]=2;
        }
    }
}
