class Solution {

    public static int[] reverse(int[] nums, int l , int h){
        int i = l; int j =h;
        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]= temp;

            i++;
            j--;
        }

        return nums;
    }
    public void rotate(int[] nums, int k) {

    
        int n = nums.length;
        k = k%n;
      reverse(nums, 0, n-k-1);
      reverse(nums, n-k, n-1);
      reverse(nums, 0, n-1);
        for(int m =0; m<n; m++){
            System.out.print(nums[m]);
       }

        
          //o(n) tc ,  o(n) sc.  
    //     int n = nums.length;
    //     int[] temp = new int[n];
    //    for(int i =0; i<n; i++){
    //     int index= (i+k)%n;
    //     temp[index]= nums[i];
    //    }

    //     for(int i =0; i<n; i++){
    //         nums[i]=temp[i];
    //         System.out.print(nums[i]);
    //     }
        
    }
}