class Solution {
    public void moveZeroes(int[] nums) {
        // int index=0;
        // int n = nums.length;
        // for(int i =0; i<n; i++){
        //    if(nums[i]!=0){
        //     nums[index++]=nums[i];
        //    }
        // }

        // for(int i = index; i<n ; i++){
        //     nums[i]=0;
        // }

        // for(int i =0; i<n ; i++){
        //     System.out.print(nums[i]);
        // } no need to print


        //single pass
        int index =0; int n = nums.length;
        for (int i = 0; i < n; i++) {
        if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index++] = temp;
        
    }
}
    }
}