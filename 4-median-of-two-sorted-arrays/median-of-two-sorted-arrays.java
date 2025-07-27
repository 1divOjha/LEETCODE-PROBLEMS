class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;
        int[] arr= new int[n1+n2];
        int i=0; int j =0;
        int index=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                arr[index]=nums1[i];
                i++;
            }
            else{
                 arr[index]=nums2[j];
                 j++;
            }
            index++;
        }
        if(i>=n1 ){
            while(j<n2){
                arr[index++]=nums2[j++];
            }
        }

        if(j>=n2){
            while(i<n1){
                arr[index++]=nums1[i++];
            }
        }
        
        double ans =0;
        if(index%2==0 ){
            int in = index/2;
             ans = arr[in] + arr[in-1];
            ans= ans/2;
        }
        else{
            int in = index/2;
            ans = arr[in];
        }

        return ans;
    }
}