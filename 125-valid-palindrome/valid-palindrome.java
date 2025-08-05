class Solution {
    public boolean isPalindrome(String s) {
        //its easy, see its basically that only using 2 pointers.
        //but the twist here is: we have to ignore non alphanumeric characters, and also not case sensitive
        int start=0;
        int end= s.length() -1;
        while(start < end){
            while(start < end && ! Character.isLetterOrDigit(  s.charAt(start)  )){
                start++;
                //move left pointer to a valid character, ignoring others
            }

            while(start<end && ! Character.isLetterOrDigit(s.charAt(end)) ){
                end--;
                //move right pointer to a valid character, ignoring others
            }

            //now valid syntax reached, so compare, and (A==a) remember

            if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))){
                start++; end--;
            }
            //else means not equalso- not a palindrome
            else{
                 return false;
            }

        }

        return true;
    }
}