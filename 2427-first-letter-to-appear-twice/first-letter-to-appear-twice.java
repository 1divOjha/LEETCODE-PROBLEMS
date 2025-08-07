class Solution {
   
    public char repeatedCharacter(String s) {
        //all three accepted

        int [] arrayocc= new int[26];
        Arrays.fill(arrayocc,-1);
        for(int i=0; i<s.length(); i++){
            int val= arrayocc[ s.charAt(i) -'a'];
            if(val==-1){
                arrayocc[ s.charAt(i) -'a']=i;
            }
            else{
                return s.charAt(i);
            }
        }

        return '\0';

    //**************************************************************************** */
        // boolean seen[] = new boolean[26]; // only lowercase- its mentioned in the question
        // for(char c: s.toCharArray()){
        //     if(seen[ c -'a']){ 
        //     // i.e if seen already, as soon as we see an element 
        //     //again(i.e leftmost 2nd occurance of a character), we return the char
        //     return c;
        //     }

        //     else{ //not seen till now, but saw now so make it true
        //     seen[c-'a']=true;

        //     }
        // }
        // //the sum has said that it has atleast one repeating char, so shouldnt reach here
        // return '\0';

/************************************************************************************************************************** */
                // int ans = Integer.MAX_VALUE;
        // for(int i =0; i<s.length() ; i++){
        //     for(int j =i+1; j<s.length(); j++){
        //         if(s.charAt(i)==s.charAt(j)){
        //             ans =Math.min(ans, j);
        //         }
        //     }
        // }
        // return s.charAt(ans);
    }
}