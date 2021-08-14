// first method using priority queue 

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i=0;i<nums.length;i++)
        {
            queue.add(nums[i]);
        }
        System.out.println(queue);
        int i=1;
        while(i<k)
        {
            queue.poll();
            i++;
        }
        return queue.poll();
        
    }
}



