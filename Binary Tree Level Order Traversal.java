class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        lo(root,res,0);
        return res;
        
    }
    private static void lo(TreeNode root,List<List<Integer>> res,int level)
    {
        if(root==null)
            return;
        if(level>=res.size())
        {
            List<Integer> nl=new ArrayList<>();
            res.add(nl);
        }
        res.get(level).add(root.val);
        lo(root.left,res,level+1);
        lo(root.right,res,level+1);
    }
}
