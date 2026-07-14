class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // for(int i=1;i<nums.length;i++){
        //     int count=1;
        //     if(nums[i]==nums[i-1]){
        //         count++;
        //     }
        // }
            int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
        
    }
}

// Example 1:

// Input: nums = [1,1,2,3,3,4,4,8,8]
// Output: 2
// Example 2:

// Input: nums = [3,3,7,7,10,11,11]
// Output: 10