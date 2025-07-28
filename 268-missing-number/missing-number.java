class Solution {
    public int missingNumber(int[] nums) {

        // app 1- using expected sum
        int n = nums.length;
        int sum = n * (n+1)/2;
        int temp=0;
        for(int i =0; i<n; i++){
            temp+=nums[i];
        }
        return sum-temp;


        //app2 - using xor or bitwise or ^
        // int n = nums.length;
        // int xor = n; // n^n =0;
        // for(int i =0; i< n ; i++){
        //     xor ^= i^nums[i];
        // } 

        // return xor;



        // inefficient wrong ans, passed 112/122 cases
        // Arrays.sort(nums);
        // int n = nums.length;
        // int i = 1;
        // if(n==2){
        //     if((nums[0]+1) != nums[1]){
        //         return (nums[0]+1);
        //     }
        //     else if(nums[0]!=0){
        //         return 0;
        //     }
        //     else{
        //         return n;
        //     }
        // }
        // while(i<n){
        //     if(nums[i] != (nums[i-1]+1)){
        //         return (nums[i-1]+1);
        //     }
        //     i++;
    
        // }
        // return 0;
    }
}