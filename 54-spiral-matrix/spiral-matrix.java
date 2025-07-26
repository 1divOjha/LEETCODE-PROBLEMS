class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

    // so we need four pointers, left at 0, right at col-1, top at 0, and bottom at row-1
    //we have to increment and decrement them accordingly, also have to make sure that while 
    //decreasing or increasing them , rows dont cross over rows, and cols dont cross over cols,

    int left=0; int right = col-1;
    int top=0; int bottom= row-1;
    List<Integer> ans= new ArrayList<>();
    //overall condition is, top must be <= bottom, and left must be <= right, they should not cross
    while(left<=right && top<=bottom){
        //traversal left to right
        for(int i = left; i<=right; i++){
            ans.add(matrix[top][i]);
        }
        top++;

        //top to bottom
        for(int i =top; i<=bottom; i++){
            ans.add(matrix[i][right]);
        }
        right--;

        //right to left (we did top++ above), we need to make sure it didnt cross bottom
        if(top<=bottom){for(int i = right; i>=left;i--){
            ans.add(matrix[bottom][i]);
        }
        bottom--; }
        

        //bottom to top , we did right -- above, need to make sure it didnt cross left 
        if(left<=right){  
            for(int i= bottom; i>=top; i--){
            ans.add(matrix[i][left]);
        }
        left++;}
       
    }
return ans;
    }
}