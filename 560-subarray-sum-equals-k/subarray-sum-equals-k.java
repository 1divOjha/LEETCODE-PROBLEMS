class Solution {
    public int subarraySum(int[] nums, int k) {
       //the sum is total number of subarrays, with sum = k;
    int count=0;
    for(int i =0; i<nums.length; i++){
        int sum=0;
        for(int j =i; j<nums.length; j++){
            sum+=nums[j];
            if(sum==k){
                count++;
            }
        }
    }
    return count;
    }
}