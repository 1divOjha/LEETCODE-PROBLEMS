class Solution {
    public int search(int[] nums, int target) {
        int low =0; int high = nums.length-1;

        //sorted in ascending order array given
        while(low<=high){
            int mid = low + (high-low)/2 ;

            if(target==nums[mid]){
                return mid;
            }
            else if(target> nums[mid]){
                low =mid+1;
            }
            else{
                //mid already searched above
                high =mid-1;
            }
        }

        return -1;
    }
}