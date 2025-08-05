class Solution {
    public boolean isPalindrome(int x) {





         if (x < 0) return false;  // Negative numbers are not palindromes

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int rem = x % 10;
            x = x / 10;
            reversed = reversed * 10 + rem;
        }

        return original == reversed;

        
    //     int rem=0; int ans=x;
    // StringBuilder() s= new StringBuilder();
    //     while (rem!=0) {
    //         rem= ans % 10;
    //         ans= ans/10;

        

    }
}