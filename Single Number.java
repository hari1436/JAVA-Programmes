class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            res^=nums[i];
        }
        return res;
    }
}
// here we can find the element which has single occureenece in the array using xor operator since same number xor will result it to 0
