import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {

        Arrays.sort(nums);

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            while (nums[right] - nums[left] > 1) {
                left++;
            }

            if (nums[right] - nums[left] == 1) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}
// Input: nums = [1,3,2,2,5,2,3,7]

// Output: 5

// Explanation:

// The longest harmonious subsequence is [3,2,2,2,3].