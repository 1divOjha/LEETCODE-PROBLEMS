class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length(); //pointer i for t
        int m = s.length(); // pointer j for s

        if(m>n){
            return false;
        }

        int j=0;
        for(int i=0; i<n && j<m ; i++){
            if(t.charAt(i)== s.charAt(j)){
                j++;
            }
        }

        if(j>=m){
            return true;
        }

        return false;

    }
}