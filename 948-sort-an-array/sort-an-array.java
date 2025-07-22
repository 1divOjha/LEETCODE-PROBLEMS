class Solution {

 public static int partition(int[] nums, int l, int h){
    int i =l-1;
    int j =h+1;
    int mid = (l+h)/2;
    int pivot = nums[mid];
    while(true){
        do{
            i++;
        } while(pivot> nums[i]);

        do{
            j--;
        } while(pivot<nums[j]);

        if(i>=j) return j;
       int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
 }
    public static void quicksort(int[] nums , int l, int h){
        if(l<h){
        int p =  partition(nums, l, h );
        quicksort(nums, l, p);
        quicksort(nums, p+1,h);
       // sorts inplace, no need to return;
        }

    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        quicksort(nums, 0 , n-1);

        return nums;
    }
}