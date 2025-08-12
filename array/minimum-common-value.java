class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        int minCommon = Integer.MAX_VALUE;
        while ((p1 < nums1.length && (p2 < nums2.length))){
            if (nums1[p1] == nums2[p2]){
                minCommon = Math.min(minCommon,nums1[p1]);
                break;
            } else if (nums1[p1] < nums2[p2]){
                p1++;
            } else{
                p2++;
            }
        }
        return minCommon != Integer.MAX_VALUE ? minCommon : -1;
    }
}