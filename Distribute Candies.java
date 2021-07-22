class Solution {
    public int distributeCandies(int[] candyType) {
        int l=candyType.length/2;
        HashSet<Integer> t=new HashSet<>();
        for(int i:candyType)
        {
            t.add(i);
        }
        if(t.size()==l)
            return l;
        if(t.size()>l)
           return l;
         if(t.size()<l)
           return t.size();
        
        return 0;
    }
}
// using hashset to keep count of diiferent types of chocolate
