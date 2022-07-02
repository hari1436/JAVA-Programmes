class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Map.Entry<String,Integer>>pq=new PriorityQueue<>((a,b)->b.getValue()==a.getValue()?a.getKey().compareTo(b.getKey()):b.getValue()-a.getValue());
        HashMap<String,Integer>hm=new HashMap<>();
        for(String i:words)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
            
        }
        List<String>res=new ArrayList<>();
        for(Map.Entry<String,Integer>c:hm.entrySet())
        {
           pq.add(c);      
        }
        while(k-->0)
        {
            res.add(pq.poll().getKey());
        }
        return res;
    }
}
