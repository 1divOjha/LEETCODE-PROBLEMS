class Solution {
    public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new  PriorityQueue<>(Collections.reverseOrder());
//         for(int num : nums){
//             pq.add(num);
//         } 
// int ans =0;
//         while(k>0){
//            ans= pq.poll();
//             k--;
//         }
//         return ans;


//method 2 - t.c : to build pq - reduced fron nlogn to nlogk; by keeping only k elements in pq
// now using minimum(by default) pq, 
PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap by default, has smallest element at node
int n = nums.length;
for(int i =0; i<n ; i++){
    pq.add(nums[i]);
    if(pq.size()>k){
        pq.poll();
    }
}
return pq.peek();
    }
}