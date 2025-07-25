class Solution {
    public void moveZeroes(int[] nums) {
        // int index=0;
        // int n = nums.length;
        // for(int i =0; i<n; i++){
        //     if(nums[i]!=0){
        //         nums[index]=nums[i];
        //         index++;
        //     }
        // }
        // for(int i= index; i<n; i++){
        //     nums[i]=0;
        // }
        // for(int i =0; i<n;i++){
        //     System.out.print(nums[i]);
        // }

         int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] with nums[index] if i > index
                if (i != index) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                }
                index++;
            }
        }
    }
}