class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q= new ArrayDeque<>();
        int n = nums.length;
        int[] ans= new  int[n-k+1];
        int max =Integer.MIN_VALUE;
        for(int i =0; i<k; i++){
           while(!q.isEmpty() && nums[i] >= nums[q.peekLast()]){
            q.removeLast();
           }
           q.addLast(i);
        }

        for(int i =k; i<n; i++){
            ans[i-k] = nums[q.peekFirst()];
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && nums[i] >= nums[q.peekLast()]){
            q.removeLast();
           }
           q.addLast(i);
        }
        ans[n-k]=nums[q.peekFirst()];
        return ans;
    }
}