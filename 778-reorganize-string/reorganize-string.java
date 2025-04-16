class Solution {
    public String reorganizeString(String s) {
        //created hashmap to store frequency of characters
        HashMap<Character, Integer> map = new HashMap<>();

        int maxFreq = 0;

        //used fir each loop and updated/put characters in the map along with their frequencies in the string
        for (char ch : s.toCharArray()) {
            int Freq = map.getOrDefault(ch, 0) + 1;
            map.put(ch, Freq);
            maxFreq = Math.max(maxFreq, Freq);
        }

        // max allowed freq is (l+1)/2
        int l = s.length();
        if (maxFreq > (l + 1) / 2) {
            return "";
        }

        // maxheap, to store frequency, with custom comparator, and type Map.Entry<char ,int>
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        //this will generate the max heap 
        pq.addAll(map.entrySet());

        //prev entry will be stored in this, and if not null, i.e. has freq left after appending( the current becomes prev)
        // then it will be added back to the heap
        Map.Entry<Character, Integer> prev = null;

        //char to string builder
        StringBuilder sb = new StringBuilder();

        //greedy approach,
        while (!pq.isEmpty()) {

            //max freq char , removed and stored in current
            Map.Entry<Character, Integer> current = pq.poll();
            sb.append(current.getKey());

            //in first go its null, so wont enter here, but at the end after updating currents freq, when we put curr in prev, then its no more null, 
            //and if it has more than 0 freq of the char , then its added bach to the heap, rest char arrangemenet acc to freq pq will handle
            if (prev != null && prev.getValue() > 0) {
                pq.add(prev);
            }

            //updating current map entries value as iyts freq shld be reduced as we added it in to the stringbuilder
            current.setValue(current.getValue() - 1);
            //now if current is null, i.e. element has no freq left
            prev = current;

        }

        return sb.length() == s.length() ? sb.toString() : "";

    }
}