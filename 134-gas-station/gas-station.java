class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currbalance =0;
        int count =0;
        int total =0;

        for(int i =0; i< gas.length ; i++){
            total += (gas[i] - cost[i]) ;
             currbalance += (gas[i] - cost[i]);
             if(currbalance <0){
                currbalance=0;
                count= i+1;
             }

        }

        return (total>=0)? count:-1;
    }
}