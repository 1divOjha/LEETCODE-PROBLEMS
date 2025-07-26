class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // step 1=> we will transpose first
        // step 2=> then we will reverse each row;

        // in transpose we just need to swap the upper or lower triangle , not the full matrix(this will  cause errors)
        for(int i =0; i<n ; i++){
            for(int j =i+1; j<n; j++){
                //swapped upper traingle
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }

        //now we can see via dry run, the resultant transposed matrix, sp now to obtain our resultant matrix,
        // we need to reverse each row individually, row is reversed, so row index will be constant

        for(int i=0; i<n; i++){
            int l =0; int h=n-1;
            while(l<h){
                // swap -> matrix[i][l]; with matrix[i][h];
                int temp = matrix[i][l];
                matrix[i][l]=matrix[i][h];
                matrix[i][h]= temp;
                l++;
                h--;
            }
        }


    }
}