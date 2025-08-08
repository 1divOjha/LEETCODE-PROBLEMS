class Solution {
    public static void reverse(char[]c, int i, int j){
        while(i<j){
            char t= c[i];
            c[i]= c[j];
            c[j]= t;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        
    char[] carr= s.trim().toCharArray();
    int start=0; 
    for(int end =0; end<carr.length; end++){
        if(carr[end]==' '){
            reverse(carr,start, end-1);
            start=end+1;
        }
    }
    //at last if there is no space after last word, it doesnt reverse that word, so handling it separately
    reverse(carr, start, carr.length-1);
    return new String(carr);
    }
}