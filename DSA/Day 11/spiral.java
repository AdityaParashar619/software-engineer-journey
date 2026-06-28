import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(top<=bottom && left<=right){

             //left->right
        for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
        }
        top++;
        //top->bottom
        for(int i=top;i<=bottom;i++){
            list.add(matrix[i][right]);
        }
        right--;
        //right->left
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            list.add(matrix[bottom][i]);
        }
        }
        bottom--;
        //bottom->top
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }
        }
        left++;
        }
        return list;
    }
}
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]