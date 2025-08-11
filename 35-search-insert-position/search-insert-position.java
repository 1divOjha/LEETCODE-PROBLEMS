class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length; int index =-1;
        for(int i =0; i<n ; i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]< target){
                index= Math.max(index,i);
            }
        }

        return index+1;
    }
}