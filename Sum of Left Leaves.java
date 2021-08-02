class Solution {
     
       public int sumOfLeftLeaves(TreeNode root) {
        return helper(root);
    }
    
    public int helper(TreeNode root) {
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += helper(root.left);
            }
        }
        
        if (root.right != null) {
            sum += helper(root.right);
        }
        return sum;
    }
