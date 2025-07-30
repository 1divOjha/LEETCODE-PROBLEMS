class Solution {
    public int singleNumber(int[] nums) {
        // we can just xor these , and get the odd value out
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans^=nums[i];
        }
        return ans;
    }
}