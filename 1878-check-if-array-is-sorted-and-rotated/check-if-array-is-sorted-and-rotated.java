class Solution {
    public boolean check(int[] nums) {
        // int n = nums.length;
        
        // if(n <3){
        //     return true;
        // }
        // int count=-1;
        // int flag=false;
        // //rotated sorted array
        // for(int i =1; i<n; i++){
        //     if( nums[i]>=nums[i-1]){
        //         count++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        //int index=0;
        // if(count!=(-1)){
        //     index = count;
        // }
        // else{
        //     return false;
        // }
        // for(int i = index+1; i<n; i++){
        //     if(nums[index]<arr[i]){
        //      return false;
        //     }
        // }

        // return true;
// find largest elements index, and from that index till end check if all elementto its right smaller than that index and return true 
//if index = last, then check if full array is sorted, return true. also return true for array size less than 3
//otherwise return false
        
        int n = nums.length;
        if (n < 3) return true;

        // Step 1: copy and sort
        int[] b = Arrays.copyOf(nums, n);
        Arrays.sort(b);

        // Step 2: find ALL indices where smallest element occurs
        int smallest = b[0];

        for (int start = 0; start < n; start++) {
            if (nums[start] != smallest) continue; // only test valid starting points

            boolean match = true;
            for (int i = 0; i < n; i++) {
                int rotatedIndex = (start + i) % n;
                if (nums[rotatedIndex] != b[i]) {
                    match = false;
                    break;
                }
            }

            if (match) return true; // found a valid rotation
        }

        return false;
    }
}