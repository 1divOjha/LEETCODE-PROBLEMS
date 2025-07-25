class Solution {
    public int[][] merge(int[][] intervals) {

        //a 2d array given , each row has 2 elements, start and end. 
        int n = intervals.length;
        //we are sorting arr by 0th index of every element, i.e by start time, in ascending order
        Arrays.sort(intervals, (a,b)-> a[0] -b[0]);
        if(n<2){ 
        return intervals; }

        int res =0;
        
        for(int i =1; i<n; i++){
            //if prev [i-1][1] element>= next [i][0] element, update current [i][1]
            //we enter if, means merging intervals.
            if(intervals[res][1] >= intervals[i][0]){
                //we updated the end time for the res index element, which ever was max, 
                //as it may be the next ele ends early than prev element
             intervals[res][1]= Math.max( intervals[res][1], intervals[i][1]);
             // and notice we are not updating the res here, as there may be more next pairs that can be merged with it,
             // so we cant update res. we only update res, when nonoverlapping pairs, it can also be basically count of non overlapping pairs
            }

            else{
                //non overlapping pair, so we ll put current i's , valye at res index
                res++;
               
                intervals[res][0]=intervals[i][0];
                intervals[res][1]=intervals[i][1];
            }
        }
            int[][] ans = new int[res+1][2];
            for(int i=0; i<=res; i++){
                ans[i][0]= intervals[i][0];
                ans[i][1]= intervals[i][1];
            }

        // now we need to return an array of the non-overlapping intervals 
        
    

     return ans;

    }
}