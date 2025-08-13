class Solution {
        static final int CHAR= 256;
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m!=n)return false;
        int [] count = new int[CHAR];
        for(int i =0; i<=n-m ; i++){
            for(int j =0; j<m ; j++){
                count[t.charAt(j)]++;
                count[s.charAt(i+j)]--;
            }
        }

        for(int i =0; i<CHAR; i++){
            if(count[i]!= 0){
                return false;
            }
        }

        return true;
    }
}