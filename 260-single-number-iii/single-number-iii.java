class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int[]ans = new int[2];
        for(int num: nums){
            if(set.contains(num)){
                set.remove(num);
            }
            else{
                set.add(num);
            }
        }
        
        Iterator<Integer> itr= set.iterator();
        int i =0;
        while(i<2){
            ans[i]=itr.next();
            i++;
        }
        return ans;
    }
}