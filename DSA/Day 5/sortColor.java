import java.util.Arrays;
class Solution {
    public void sortColors(int[] nums) {
Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
// for(int i=0;i<nums.length;i++){
//     for(int j=i+1;j<nums.length;j++){
//         if(nums[i]>=nums[j]){
//             nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
//         }
//     }
// }
    }
}
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]