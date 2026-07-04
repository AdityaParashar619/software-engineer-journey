import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 is considered before the array starts
        map.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            // Convert 0 to -1 and 1 to +1
            if (nums[i] == 0) {
                prefixSum--;
            } else {
                prefixSum++;
            }

            // If this prefix sum has been seen before,
            // then the subarray between the two indices has sum 0
            if (map.containsKey(prefixSum)) {
                int length = i - map.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store only the first occurrence
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}