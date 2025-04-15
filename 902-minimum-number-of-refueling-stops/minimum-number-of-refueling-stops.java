class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int prevstation=0; 
        int gasststops=0;
        int currfuel = startFuel;

        // for each loop so station[0] = dist , station[1] = gas at gastation;
        for(int[]station : stations){
            //dist between current and prev station, will be subtracyed from currfuel
            currfuel-= (station[0] - prevstation);

            // until fuel is more than zero, in this inner while loop
            while(currfuel<0){
                if(maxHeap.isEmpty()){
                    return -1;
                }
                //adding from past stations only
                currfuel += maxHeap.poll();
                gasststops++;
            }

            //fuel more than 0
            prevstation = station[0];
            maxHeap.add(station[1]);
        }

        // updating currfuel, this will tell us if we can reach target without stopping or not
        currfuel -= (target - prevstation);


        // for last stop from target, this loop means we cant reach target without making a stop, bt if heap empty, so no fuel left, 
        //otherwise we refuel until there is fuel in heap, and keep uupdating the stops
        while( currfuel<0){
            //no fuel from gasstatiosn left
            if(maxHeap.isEmpty()){
                    return -1;
                } 

            currfuel += maxHeap.poll();
                gasststops++;
        }


    return gasststops;

    }
}