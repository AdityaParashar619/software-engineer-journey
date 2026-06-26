class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
}
// Input: nums = [3,4,5,1,2]
// Output: true