class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length-1;
        int[] arr = new int[2];
        
        while(a<=b){
            if(numbers[a]+numbers[b]==target){
                arr[0]=a+1; arr[1]=b+1;
                return arr;
            }
            else if(numbers[a]+numbers[b]<target){
                a = a+1;
            }else{
                b=b-1;
            }
        }
        return arr;
    }
}
