class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //this is a row wise sorted and column wise sorted matrix,
        //first integer of each row is greater than the last integer of the previous row- this means
        //column wise sorted matrix
        // so the approach is basically, when we choose the
        // -  upper rightmost corner-> means, to its left smaller element, below it larger element
        // - lower leftmost corner->means, to its right larger elements, 
        // in other 2 corners, we have either smaller choices both sides, or larger choices both sides, to choose from

        int row=matrix.length;
        int col=matrix[0].length;

        int i =0; int j = col-1;
        //i - row pointer, j col pointer
        while(i<row && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                 j--;
            }
            else{
                i++;
            }
        }
    return false;
    }
}