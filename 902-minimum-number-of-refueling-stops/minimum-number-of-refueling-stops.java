class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
    PriorityQueue<Integer> pq = new  PriorityQueue<>(Collections.reverseOrder());

    int gasstopcount=0;
    int fuelleft =startFuel;
    int i =0;


    //bcoz if fuel left is equal or more than target, then no need to stop to refuel, so we reached target, direct 
    while( fuelleft < target){

        // we want to update heap here, till stations left(i) , and fuelleft is more than equal to dist of current station
        //so we did && here, if either condition is not met, we check beffore polling that is pq empty, if yes then return -1,
        // cuz we dont have fuel
        //(as we used to update pq whenever we move and had more or equal fuel to cur dist)
        // and if pq not empty then we poll(), since we have less curr fuel than curr dist, 
        //so we cant reach currdist with this fuel , we need to refuel, i.e. poll
        while( i<stations.length && stations[i][0] <= fuelleft ){
            pq.add( stations[i][1]);
           // fuelleft -= stations[i][0]; 
           //unnecessary, at one point the dist will be more than curr fuel , 
           //then we just need to  refuel, poll() 
            i++;
        }

        if(pq.isEmpty()){
            return -1;
        }

        fuelleft += pq.poll();
        gasstopcount++;
        

    }

  return gasstopcount;

    }
}