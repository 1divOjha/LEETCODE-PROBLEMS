class Solution {
    public String reorganizeString(String s) {
      // we make hasmap and put all char and freq in it
      // nxt we also check if max allowed freq , if more than that return ""
      // nxt we make a pq of map.entry type, with collection.reverseorder 
      // we  add map.entrySet() to pq;
      // then until pq is emprt i.e till theres an element with sm freq, we will do this while loop
      // We call this a Greedy Approach because at each step, the algorithm makes the locally optimal (greedy) choice
      // — it picks the most frequent character that can be placed safely — with the hope that this leads to a valid and optimal solution overall. 
      // we greedily select the character with the highest frequency (thanks to the max-heap)
      // we poll, at first and add the char(with max freq) to the stringbuilder , and the is stored in current variable.
      // then we check if a prev variable is not null, and has freq >0 , so we add it back to the max heap
      // if not outside loop, the current reduces freq by one, as already added to the string, and then the current becomes the prev, 
      // at last we check if the given string length and our string is equal , if yes we return our string, otherwise ""

      HashMap<Character, Integer> map = new  HashMap<>();
      int maxFreq= 0;
       for(char ch : s.toCharArray()){
        int freq = map.getOrDefault(ch, 0)+1;
        map.put(ch, freq);
        maxFreq = Math.min(maxFreq, freq);

       }
       if (maxFreq > (s.length() + 1) /2){
        return "";
       }

       StringBuilder sb = new StringBuilder();

       PriorityQueue<Map.Entry<Character, Integer>> maxheap = new  PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
       maxheap.addAll(map.entrySet());

       Map.Entry<Character, Integer> prev = null;

       while(!maxheap.isEmpty()){
        Map.Entry<Character, Integer> curr= maxheap.poll();
        sb.append(curr.getKey());

        if(prev!= null && prev.getValue() >0){
            maxheap.add(prev);
        }

        curr.setValue(curr.getValue() -1);
        prev = curr;


       }
       return sb.length()==s.length()?sb.toString():"";
       
    }
}