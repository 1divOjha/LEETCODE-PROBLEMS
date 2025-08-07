class Solution {
    public char repeatedCharacter(String s) {
        int ans = Integer.MAX_VALUE;
        for(int i =0; i<s.length() ; i++){
            for(int j =i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    ans =Math.min(ans, j);
                }
            }
        }

        return s.charAt(ans);


    }
}