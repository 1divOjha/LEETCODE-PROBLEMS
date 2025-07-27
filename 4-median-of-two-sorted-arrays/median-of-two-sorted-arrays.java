class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        //O(log(min(m,n))) -tc , sc=O(1);
        int m = nums1.length; // we made sure, m has the size of smaller array
        int n = nums2.length; // smaller array

        // ✅ Edge case: if smaller array is empty
        if (n == 0) {
            if (m % 2 == 0) {
                int mid1 = m / 2;
                int mid2 = mid1 - 1;
                return (nums1[mid1] + nums1[mid2]) / 2.0;
            } else {
                return nums1[m / 2];
            }
        }
    
        // we will be looping 2 pointers, low and high ,till the smaller array, so we make sure that we fix it
        //check if nums2 is smaller then call this method again, with interchanged arguments.
        if(n < m){
            return findMedianSortedArrays(nums2,nums1);
        }
        
        

        int low=0; int high=m; // imp thing remember high =m, its nt zero based indexing, its position of partition
        while(low<=high){
        int i = (low+high)/2; //partition logic of smaller array- nums1
        int j = (m+n+1)/2 -i ;//partition logic of nums2 =>depends on i (partition logic of nums1),  
        
        //now set max left1,2  & rightmin1,2.  nums1 around i(partition) nums2 around(j-> partition)
        int maxleft1 = (i==0)?Integer.MIN_VALUE:nums1[i-1]; // used min value in maxleft- its obvious, otherwise how will we compare ans update maxlefts value, it its already maximum
        int minright1 = (i==m)? Integer.MAX_VALUE:nums1[i]; //starts from i; used max value in minright - its obvious
        // i==m see properly

        int maxleft2 = (j==0)?Integer.MIN_VALUE:nums2[j-1];
        int minright2 = (j==n)?Integer.MAX_VALUE:nums2[j]; // right partition stsrts from j only
        // i==n see properly

        //valid partition check by this if statement
        // entered this statement means, atleast once the while loop iterated and max, min values are set, now
        if(maxleft1 <= minright2 && maxleft2 <= minright1){
            
            //✅ This means all elements in the left partitions (from both arrays) are ≤ all elements in the right partitions.
            //So the merged array is conceptually split perfectly.
            if((m+n)%2 ==0){
                return ((double)Math.max(maxleft1,maxleft2) + Math.min(minright1,minright2))/2;
            }
            else{
                return (double)Math.max(maxleft1,maxleft2);
            }

        }

        //we only change high and low on basis of i, because, while loop is in range of nums1, 
        //and its partition is i ( i is starting index of right half of nums1)
        // i , j partitions of nums1, and nums2 depend on high and low
        else if(maxleft1 > minright2){
            //we need to move/search in left, so move pointer high
            high =i-1;
        }

        //else maxleft2>minright1
        else{
            //we moved right
            low = i+1; 
        }

        }


    //it wont reach here, jst for no compilation error, we provided this
        return 0.0;

//********************************************************************************************************* 


        // approach 2- (not optimised ) Total: O(n1 + n2) time.c,  s.c-O(n1 + n2) extra space.
        //it ran and was submitted as  well;
        //int n1= nums1.length;
        //int n2= nums2.length;
        // int[] arr= new int[n1+n2];
        // int i=0; int j =0;
        // int index=0;
        // while(i<n1 && j<n2){
        //     if(nums1[i]<=nums2[j]){
        //         arr[index]=nums1[i];
        //         i++;
        //     }
        //     else{
        //          arr[index]=nums2[j];
        //          j++;
        //     }
        //     index++;
        // }
        // if(i>=n1 ){
        //     while(j<n2){
        //         arr[index++]=nums2[j++];
        //     }
        // }

        // if(j>=n2){
        //     while(i<n1){
        //         arr[index++]=nums1[i++];
        //     }
        // }
        
        // double ans =0;
        // if(index%2==0 ){
        //     int in = index/2;
        //      ans = arr[in] + arr[in-1];
        //     ans= ans/2;
        // }
        // else{
        //     int in = index/2;
        //     ans = arr[in];
        // }

        // return ans;
    }
}