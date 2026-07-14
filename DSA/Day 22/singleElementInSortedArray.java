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
