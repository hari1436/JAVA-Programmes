// first solution using sorting
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

// second solution using hashmap
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int i:nums)
        {
            if(result!=null && result.get(i)!=null)
            {
                int count=(int)result.get(i);
                result.put(i,++count);
            }
            else
            {
                result.put(i,1);
            }
        }
        int c=nums.length/2;
        
        for(Map.Entry m:result.entrySet())
            {
            if((int)m.getValue()>c)
            {//System.out.println(m.getKey()+" " +m.getValue());
                return (int)m.getKey();}
        }
        
        
        
        return 0;
    }
}
