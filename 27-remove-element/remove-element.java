class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] expected_num =new int[n];
        int index =0;
        for(int i =0; i<n; i++){
            if(nums[i] != val){
                expected_num[index++]=nums[i]; 
            
            }
        }
        for(int i =0; i<index; i++){
            nums[i]= expected_num[i];
        }
        return index;

    }
}