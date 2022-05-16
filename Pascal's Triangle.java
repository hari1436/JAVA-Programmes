class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>inti=new ArrayList<>();
        inti.add(1);
        res.add(inti);
        if(n==1)
            return res;
        else
        {
            for(int i=2;i<=n;i++)
            {
                int a[]=new int[i];
                Arrays.fill(a,1);
                List<Integer>list=res.get(i-2);
                int k=0;
                for(int j=1;j<i-1;j++)
                {
                    a[j]=(int)(list.get(k)+list.get(k+1));
                    k++;
                }
               List<Integer>r=new ArrayList<>();
               for(int in:a)
                   r.add(in);
                
               res.add(r); 
            }
        }
        return res;
    }
}
