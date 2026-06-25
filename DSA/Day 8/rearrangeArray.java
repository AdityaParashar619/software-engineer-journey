class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int j = 0;
        int neg = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                arr[j] = nums[i];
                j += 2;
            } else {
                arr[neg] = nums[i];
                neg += 2;

            }
        }
        return arr;
    }
}