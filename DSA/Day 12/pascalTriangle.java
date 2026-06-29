import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> first=new ArrayList<>();
        first.add(1);
        ans.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> b=new ArrayList<>();
            b.add(1);
            for(int j=1;j<i;j++){
                int sum=0;
                List<Integer> a=ans.get(i-1);
                sum=a.get(j-1)+a.get(j);
                b.add(sum);
            }
            b.add(1);
            ans.add(b);
        }
        return ans;
    }
}

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]