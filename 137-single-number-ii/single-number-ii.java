class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer, Integer> map= new HashMap<>(); //elemnt - count
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer, Integer> en: map.entrySet()){
            if(en.getValue()==1){
                return en.getKey();
            }
        }

//hopefully wont reach here
return 0;
    }
}