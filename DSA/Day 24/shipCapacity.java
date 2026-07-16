class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // Minimum possible capacity = maximum package weight
        int low = 0;
        // Maximum possible capacity = sum of all package weights
        int high = 0;
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, days, mid)) {
                ans = mid;       // Capacity works
                high = mid - 1;  // Try to find a smaller capacity
            } else {
                low = mid + 1;   // Capacity is too small
            }
        }
        return ans;
    }
    // Checks if all packages can be shipped within the given days
    private boolean canShip(int[] weights, int days, int capacity) {
        int requiredDays = 1;
        int currentLoad = 0;
        for (int weight : weights) {
            if (currentLoad + weight <= capacity) {
                currentLoad += weight;
            } else {
                requiredDays++;
                currentLoad = weight;
            }
        }
        return requiredDays <= days;
    }
}