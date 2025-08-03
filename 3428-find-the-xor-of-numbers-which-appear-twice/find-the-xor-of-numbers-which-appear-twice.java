class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        HashSet<Integer> set= new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                xor^=num;
            }
            else{
                set.add(num);
            }
        }
        return xor;
    }
}