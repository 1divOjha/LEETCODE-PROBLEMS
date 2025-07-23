class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;
       for(int i =n-1; i>=0 ; i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        //whenever digit is 9, we put zero in its place
        digits[i]=0;
       }


//if reached here, means all digits are 9, so we need bigger array, by one size
int[] ans = new int[n+1];
ans[0]=1;
return ans;
    
    }
}