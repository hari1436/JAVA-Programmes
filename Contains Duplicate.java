class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1||nums.length==0) return false;
        HashSet<Integer> a=new HashSet<Integer>();
        for(int i:nums)
        {
            if(!a.add(i))
                return true;
    
        }
        return false;
    }
}

// we are using hashset since hashset allows unique elements only 
