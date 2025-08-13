class Solution {
    public List<Integer> findAnagrams(String s, String p) {
int n = s.length(); int m = p.length();
if(m>n) return new ArrayList<>();

 int[] count= new int[26];
 for(char c: p.toCharArray()) count[c-'a']++;

 List<Integer> ans = new ArrayList<>();
 int left =0; int right =0; int chartomatch= m;
 while(right<n){
    if( count [s.charAt(right++) -'a' ]-- > 0) chartomatch--; // since we got one charmatches
    if( chartomatch ==0)ans.add(left);
    if(right - left == m && count[s.charAt(left++) -'a']++ >=0) chartomatch++;
 }
return ans;

    // did myself - naive method
    //     int n = s.length();
    //     int m = p.length();
        
    //     if(m>n) return new ArrayList<>();
    //     List<Integer> ans = new ArrayList<>();
    //     for(int i =0 ; i<= n-m; i++){
    //         int[]temp = new int[26];
    //         for(int j =0; j<m ; j++){
    //             temp[p.charAt(j ) - 'a']++;
    //             temp[s.charAt(j+i ) - 'a']--;
    //         }

    //         int k=0;
    //         while(k<26 && temp[k]==0){ k++;}
    //         if(k==26){ans.add(i);}

    //     }
    //  return ans;


    }
}