class Solution {
    public int singleNumber(int[] nums) {
        // int n=nums.length;
        // int count=0;
        // if(n==1){
        // return nums[0];
        // }
        // for( int i=0;i<n;i++){
        // for(int j=0;j<n;j++){
        // if(nums[i]==nums[j]){
        // count++;
        // }
        // }
        // if(count==1){
        // return nums[i];
        // }
        // count=0;
        // }
        // return 0;

        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;

    }
}

// Input: nums = [4,1,2,1,2]

// Output: 4