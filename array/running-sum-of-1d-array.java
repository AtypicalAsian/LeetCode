class Solution {
    public int[] runningSum(int[] nums) {
        int currSum = 0;
        int[] res = new int[nums.length];
        for (int i=0; i < nums.length; i++){
            currSum += nums[i];
            res[i] = currSum;
        }
        return res;
    }
}