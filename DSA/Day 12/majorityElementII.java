import java.util.ArrayList;
import java.util.List;
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> list=new ArrayList<>();
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             int count=1;
//             // Skip duplicates
//             if (list.contains(nums[i])) {
//                 continue;
//             }
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count>(n/3)){
//                 list.add(nums[i]);
//             }
//         }
//         return list;
//     }
// }
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        // Find the two potential candidates
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1) {
                count1++;
            }
            else if (nums[i] == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Verify the candidates
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1) {
                count1++;
            }
            else if (nums[i] == candidate2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > nums.length / 3) {
            ans.add(candidate1);
        }

        if (count2 > nums.length / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}
//TC =O(n)
// Input: nums = [3,2,3]
// Output: [3]
