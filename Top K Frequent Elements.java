// using hashmap to store the integer and its frequency
// using priorityqueue to sort the hashmap according to the frequency that is with respect to hashmap value

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(new Integer(nums[i]),hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> c:hm.entrySet())
        {
            pq.add(c);
        }
        for(int i=0;i<k;i++)
        {
            int fn=(int)pq.poll().getKey();
            res[i]=fn;
        }
        return res;
    }
}
