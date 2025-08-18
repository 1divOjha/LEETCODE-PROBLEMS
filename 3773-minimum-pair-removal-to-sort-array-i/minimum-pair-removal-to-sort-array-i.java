class Solution {
      private boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int operations =0;
        List <Integer> list= new ArrayList<>();
        for(int x: nums)list.add(x);
        // added all elemets to arraylist

        while(!isSorted(list)) {
            int minsum= Integer.MAX_VALUE;
            int index= -1;

            for(int i =1; i<list.size(); i++){
                int sum = list.get(i) + list.get(i-1);
                if(sum < minsum){
                    minsum=sum;
                    index=i;
                } 
            }

            list.set(index-1, minsum);
            list.remove(index);
            operations++;
        }

        return operations;
    }
}