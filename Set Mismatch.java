class Solution {
    public int[] findErrorNums(int[] nums) {
        int result[]=new int[2];int sum=0;
        int f[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            if(f[nums[i]]==0)
            { f[nums[i]]++;
               sum+=nums[i];
            }
            else
            {
                result[0]=nums[i];
                
            }
        }
        
        result[1]=(nums.length*(nums.length+1)/2 -sum );
        
        return result;
    }
}
