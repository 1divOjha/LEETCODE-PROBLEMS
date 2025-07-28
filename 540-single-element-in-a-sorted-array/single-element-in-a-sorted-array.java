class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length;
        int low =0; int high = n-1;
        //doing binary search, prev pairs to single element start at even index, so we ll make sure our mid is even 
        while(low<high){
            int mid = low + (high-low)/2;

            //mid was odd, so we did mid--, so we dnt miss the starting index of the pairs
            if(mid % 2 == 1){
                mid--;
            } 

            if(nums[mid] == nums[mid+1]){
            // we made sure our mid ws even, and if starting index of pair is even - 
            //this pattern was followed, means our single lies ahead of mid+1;
            low=mid+2;
            //we are changing low pointer only when equal pairs, the single is after this pair, 
            //so low is mid+2; this way it can have answer index
            }
            // else, either mid is the single, or leftward lies the single.
            else{
                high =mid;
            }

        }

        return nums[low];
    
    }
}