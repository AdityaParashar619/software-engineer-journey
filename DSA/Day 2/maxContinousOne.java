// Input: nums = [1,1,0,1,1,1]
// Output: 3
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            }
            if (count >= maxCount) {
                maxCount = count;
            }
            if (nums[i] == 0) {
                count = 0;
            }
        }
        return maxCount;
    }
}