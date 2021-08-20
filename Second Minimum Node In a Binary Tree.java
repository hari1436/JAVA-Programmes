class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        TreeSet<Integer>a=new TreeSet<>();
        solve(a,root);
       if(a.size()==1)
           return -1;
        else
        {  a.pollFirst();
            return a.pollFirst();}}
    
    public void solve(TreeSet<Integer>a,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        a.add(root.val);
        solve(a,root.left);
        solve(a,root.right);
    }
}
