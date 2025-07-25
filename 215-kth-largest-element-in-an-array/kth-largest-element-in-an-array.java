class Solution {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue <Integer> pq = new PriorityQueue<>();
    //collections.reverseOrder() makes it max heap, its min heap by default
    int n = nums.length;
    for(int i =0; i<n; i++){
        pq.add(nums[i]);
        if(pq.size()>k){
            pq.poll();
        }
    }

 return pq.peek();


    }
}