class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //updated map
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        //this is MINHEAP
        PriorityQueue<Map.Entry<Integer,Integer>>pq= new PriorityQueue<> (( a,b) -> a.getValue() - b.getValue());

        //now we will insert in pq, only k max value, wale key-value pairs, and removing min ele from top if size more than k
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] ans = new int[k];
        int index=0;

        while(!pq.isEmpty()){
            ans[index] = pq.poll().getKey(); // get key of the value
            index++;
        }


return ans;



    }
}