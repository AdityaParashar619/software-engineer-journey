import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[j-1]){
                return true;
            }
            else{
                j++;
            }
            }
            return false;
        }
    }