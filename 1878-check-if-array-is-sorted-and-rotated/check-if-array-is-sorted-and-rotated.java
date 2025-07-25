class Solution {
    public boolean check(int[] nums) {
        // in a normal sorted rotated array, there will be only 1 drop, where prev larger than next ele
        int drop =0;
        int n = nums.length;
        for(int i =0; i<n; i++){
            int next = (i+1)%n;
            if(nums[i]>nums[next]){
                drop++;
                if(drop>1){
                    return false;
                }
            }

        }

        //if i again check here that, when drop ==1, then true,
        // it will be wrong, as there may be no drops at all, like for 1,1,1,1
       return true;
    }
}