class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); //key== prefix_sum mod k, value = index
        int sum=0;
        for(int i =0; i< nums.length; i++){
            sum+=nums[i];

            if(k!=0){
                sum%=k;
                //we are storing remainder only - of sum%k
            }
            // concept is a prefix sum%k= rem, if present previously , then we subrat current index with it, cuz between them definitely there would be sum multiple of k.

            if(map.containsKey(sum)){
                if((i- map.get(sum) ) >1){
                    return true;
                }
            }

            //if this current remainder(prefix sum) isnt present prev then we put it in map at i index
            else{
                map.put(sum,i);
            }
        }

return false;

        // brute force 0(n^2)-t.c. TLE -95/102
        // for(int i=0; i<nums.length; i++){
        //     int sum=0;
        //     for(int j=i; j<nums.length; j++){
        //         sum+=nums[j];
        //         if(sum%k==0 && (j-i+1)>=2){
        //             return true;
        //         }
        //     }
            
        // }

        // return false;

    }
}