class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res =0;

        int n = s.length();

        for(int i =0; i<n; i++){
            boolean[] visited= new boolean[256];

            //since we are handling a substring j =i, se shuru hoga loop
            for(int j =i; j<n ; j++){
                if(visited[s.charAt(j)]){
                break;
                }

                else{
                    visited[s.charAt(j)]= true;
                    res= Math.max(res, j-i+1); // for an i, j jitne baar chala + 1 is the length of distinct string
                }
            }
        }

        return res;
    }
}