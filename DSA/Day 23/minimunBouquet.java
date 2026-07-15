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