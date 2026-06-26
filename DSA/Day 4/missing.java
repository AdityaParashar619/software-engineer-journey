public class missing {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=n*(n+1)/2;
        int asum=0;
        for(int i=0;i<nums.length;i++){
            asum=asum+nums[i];
        }
        return sum1-asum;
    }
} 
// Input: nums = [3,0,1]

// Output: 2