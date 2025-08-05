class Solution {
    public boolean isPalindrome(int x) {





        //  if (x < 0) return false;  // Negative numbers are not palindromes

        // int original = x;
        // int reversed = 0;

        // while (x != 0) {
        //     int rem = x % 10;
        //     x = x / 10;
        //     reversed = reversed * 10 + rem;
        // }

        // return original == reversed;

       //************************************************************************************ */ 
        int rem=0; int ans=x;
        //to convert a number into string
        String originalstr = String.valueOf(x);
        StringBuilder sbuilder= new StringBuilder(originalstr);
        String reversestr= sbuilder.reverse().toString(); 
        //we need to convert the sbuilder into a string first

        return (originalstr.equals(reversestr));
        //i used equals bcoz it compares content of string objects,  as "==" operand compares references not the content

    }
}