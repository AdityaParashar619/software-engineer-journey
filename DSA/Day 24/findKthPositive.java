// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int j=0;
//         int count=0;
//         for(int i=1;i<Integer.MAX_VALUE;i++){
//             if(j<arr.length && i==arr[j] ){
//                 j++;
//             }
//             else{
//                 count++;
//             }
//             if(count==k){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Missing numbers before arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }
}

// Example 1:

// Input: arr = [2,3,4,7,11], k = 5
// Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
