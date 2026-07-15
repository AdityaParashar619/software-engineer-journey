class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=0;
        int max=0;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        // Check if making m bouquets is even possible
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        while(min<=max){
        int mid = min + (max - min) / 2;
        int count=0;
        int bouquet=0;
        for(int i=0;i<bloomDay.length;i++){
            
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                count=0;
            }
            if(count==k){
                bouquet++;
                count=0;
            }
        }
            if (bouquet >= m) {
                max = mid - 1;  // try fewer days
            } else {
                min = mid + 1;   // need more days
            }

        }
        return min;
    }
} 

// Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
// Output: 3
// Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
// We need 3 bouquets each should contain 1 flower.
// After day 1: [x, _, _, _, _]   // we can only make one bouquet.
// After day 2: [x, _, _, _, x]   // we can only make two bouquets.
// After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.