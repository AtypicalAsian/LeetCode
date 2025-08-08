class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int maxLen = 0;
         int left = 0;
         for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                maxLen = Math.max(maxLen,i-left+1);
            } else{
                left = i + 1;
            }
         }
         return maxLen;
    }
}