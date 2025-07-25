class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            //we gotta put 0, in place if the digit is 9
            digits[i]=0;
        }

        int[]ans = new int[n+1];
        ans[0]=1;
        return ans;
    }
}