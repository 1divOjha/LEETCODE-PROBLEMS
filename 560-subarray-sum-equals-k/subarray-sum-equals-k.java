class Solution {
    public int subarraySum(int[] nums, int k) {
    //the sum is total number of subarrays, with sum = k;
    //can be done by hashmap, where we will store prefix sum with the index
    Map<Integer, Integer> map= new HashMap<>();
    //prefix sum=0 only once, so occurance/value=1, considering all +ve elements in nums
    map.put(0,1);
    int count=0; int sum=0;
    for(int num:nums){
        sum+=num;
        // if sum-k = keyprefix, then , if map has prefix, then count++;
        //Suppose sum = current total sum up to index i

        //If there’s a previous prefix sum P such that sum - P = k,then there’s a subarray from P+1 to i that sums to k.
        if(map.containsKey(sum-k)){
            count += map.get(sum-k);
        }

        map.put(sum, map.getOrDefault(sum,0)+1);
    }

    return count;


    //*****this is the worst solution n^2 tc*****
    // int count=0;
    // for(int i =0; i<nums.length; i++){
    //     int sum=0;
    //     for(int j =i; j<nums.length; j++){
    //         sum+=nums[j];
    //         if(sum==k){
    //             count++;
    //         }
    //     }
    // }
    // return count;
    // }

}}