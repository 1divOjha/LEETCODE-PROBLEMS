class Solution {
    public String reverseWords(String s) {
 String[] words= s.trim().split("\\s+");
 //bs now reverse the words position wise , and we have the ans, after joing them into a string
 int left=0; int right = words.length -1;
 while(left<right){
    String temp = words[left];
    words[left]=words[right];
    words[right]=temp;
    left++;
    right--;
 }

return String.join(" ",words);
    
 




    //this doesnt work for multiple spaces in between words- rest works well;
    //****************************************************************************** */
    //     public static void reverse( char[] chararr, int low, int high){
    //     //char array can be modified - not returning anything just modifying it
    //     while(low<high){
    //         char temp= chararr[low];
    //         chararr[low]= chararr[high];
    //         chararr[high]=temp;
    //         low++;
    //         high--;
    //     }
    // }
    // public String reverseWords(String s) {
    //     s = new String(s.trim());
    //     char[] chararr= s.toCharArray();
    //       int n = s.length();
    //       int start=0; 
    //       for(int end=0; end<n+1; end++){
            
    //         if(chararr[end]==' ') {
    //             reverse(chararr, start, end-1);
    //             start=end+1;
    //         }
    //       }
    //       reverse(chararr, start, n-1);
    //       reverse(chararr,0, n-1);

    // return new String(chararr);

    // }
    }
}