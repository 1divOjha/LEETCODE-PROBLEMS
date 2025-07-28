class Solution {
    public int findKthPositive(int[] arr, int k) {
       
      //binary search optimisation
      //for every mid we will calculate no of missing elements, if no of  missing elements < k, we move low to the right, mid+1;
      //otherwise, high= mid-1;
      // while  loop runs till low<=high,
      //ans is low + k;
      // low stops at index such that, from it missingis greater than or equal to k
      //smallest index where misssing >=k; 

    int n = arr.length;
    int low = 0; int high= n-1;
    while(low<=high){
        int mid = low + (high-low)/2;
        // at an index i, missing elements no  = arr[i] - (i+1);
        int missing = arr[mid] - (mid +1); // since i has zero based indexing addded 1
        if(missing < k){
            //we want a mid for which missing is >= k, here missing is less so we move low ahead , mid+ 1 beacuse at this mis we already checked
            low =mid+1;
        }
        else{
            high =mid-1;
            //as at this mid we already checked
        }
    }


// finally low wld be updated such that, at that it is the smallest index where missing is more than or equal to k 
return low+k;

    }
}