public class longestSubArray {
    
    public int longestSubarray(int[] nums, int k) {

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            while(sum > k) {
                sum -= nums[left];
                left++;
            }

            if(sum == k) {
                maxLen = Math.max(maxLen, i - left + 1);
            }
        }

        return maxLen;
    }

}
