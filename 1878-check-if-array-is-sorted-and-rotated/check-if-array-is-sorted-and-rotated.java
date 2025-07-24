class Solution {
    public boolean check(int[] nums) {
       
// find largest elements index, and from that index till end check if all elementto its right smaller than that index and return true 
//if index = last, then check if full array is sorted, return true. also return true for array size less than 3
//otherwise return false

//using circular wrap concept - nlogn for sorting, n^2 t.c. sc- o(n)
// 2. Approach: Sort copy and compare with rotated original        
        // int n = nums.length;
        // if (n < 3) return true;

        // // Step 1: copy and sort
        // int[] b = Arrays.copyOf(nums, n);
        // Arrays.sort(b);

        // // Step 2: find ALL indices where smallest element occurs
        // int smallest = b[0];

        // for (int start = 0; start < n; start++) {
        //     if (nums[start] != smallest) continue; // only test valid starting points

        //     boolean match = true;
        //     for (int i = 0; i < n; i++) {
        //         int rotatedIndex = (start + i) % n;
        //         if (nums[rotatedIndex] != b[i]) {
        //             match = false;
        //             break;
        //         }
        //     }

        //     if (match) return true; // found a valid rotation
        // }

        // return false;

////////////////************************************************************************

// T.C -O(N), S.C -O(1)
/*When we check if an array is sorted (or rotated sorted),
for each element at index i, we want to compare it with the next element.*/

 int n = nums.length;
        int drops = 0;  // count where order breaks
        
        for (int i = 0; i < n; i++) {
            int next = nums[(i + 1) % n]; // wrap around
            if (nums[i] > next) {
                drops++;
                if (drops > 1) return false; // more than one drop => invalid
            }
        }
        return true;


    }
}