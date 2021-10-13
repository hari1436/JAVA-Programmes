class Solution {
    int i=0; // Declaring index as global variable 
    public TreeNode bstFromPreorder(int[] preorder) {
    
        if(preorder==null)
            return null;
        
        return solve(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    
    }
    // helper function
    public TreeNode solve(int a[],int start,int end)
    {
        if(i>=a.length||a[i]<start||a[i]>end)
            return null;
        int val=a[i++];
        TreeNode root=new TreeNode(val);
        root.left=solve(a,start,val);
        root.right=solve(a,val,end);
        
        
        return root;
    }
}
