class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int[] revIdx = new int[10001];
        Arrays.fill(revIdx, -1);
        
        for(int i = 0; i < nums2.length; i++) {
            revIdx[nums2[i]] = i; // filling only those element present in nums2
        }
        
        int index = 0;
        
        Arrays.fill(result, -1);
        
        for(int i : nums1) {
            int idx = revIdx[i];
            if(idx != -1) {
              
                for(int j = idx; j < nums2.length; j++) {
                    if(nums2[j] > i) {
                        result[index] = nums2[j];
                        break;
                    }
                } 
            }
            
            index++;
        }
        
        return result;
    }
}
