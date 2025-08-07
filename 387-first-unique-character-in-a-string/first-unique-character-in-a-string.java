class Solution {
    public int firstUniqChar(String s) {
        int countfreq[] = new int[26];

        for(int i =0; i < s.length(); i++){
            countfreq[ s.charAt(i) - 'a' ] ++;
        }

        for(int i =0; i<s.length() ; i++){
            if(  countfreq[ s.charAt(i) - 'a' ] == 1){
                return i;
            }
        }

        return -1;
    }
}