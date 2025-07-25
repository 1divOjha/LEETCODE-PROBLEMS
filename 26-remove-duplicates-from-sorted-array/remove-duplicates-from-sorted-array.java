class Solution {
    public int removeDuplicates(int[] nums) {
        int k =1; // first element is always unique
        int n = nums.length;
        int index=0;
        for(int i =1; i<n; i++){
            if(nums[index] ==nums[i]){
                continue;
                //duplicates
            }
            //came here that means, this element is not equal to prev element
            k++;
            index++;
            nums[index]=nums[i];
        }

return k;
    }
}