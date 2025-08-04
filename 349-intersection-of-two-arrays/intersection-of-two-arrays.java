class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //Arrays.asList(nums1) - can only be used when  non primitive arrays are there
        HashSet<Integer> set1= new HashSet<>();
        for(int n1: nums1)set1.add(n1);

        HashSet<Integer> resultset= new HashSet<>();
      for(int n2: nums2){
        if(set1.contains(n2)){
            resultset.add(n2);
        }
      }
      int []ans = new int[resultset.size()];
      int i=0;
      for(int rs: resultset){
        ans[i++]=rs;
      }
      return ans;
    }
}