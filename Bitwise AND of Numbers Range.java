class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while(right>left)
           right = right & right-1;
 return right;
    }
}
/*
instead of iterating through left to right we and the n with n-1 and do till left.

*/
