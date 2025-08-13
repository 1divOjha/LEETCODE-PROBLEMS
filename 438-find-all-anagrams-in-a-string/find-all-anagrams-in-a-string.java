class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        if(m>n) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i =0 ; i<= n-m; i++){
            int[]temp = new int[26];
            for(int j =0; j<m ; j++){
                temp[p.charAt(j ) - 'a']++;
                temp[s.charAt(j+i ) - 'a']--;
            }

            int k=0;
            while(k<26 && temp[k]==0){ k++;}
            if(k==26){ans.add(i);}

        }
return ans;

    }
}