class Solution {
    public int removeDuplicates(int[] nums) {
//         int i=0;
//         int k=0;
//         int prev= Integer.MIN_VALUE;
//    for( ; i< nums.length; i++){
//     int currentele= nums[i];
//     if(prev != currentele){
//         nums[k]= currentele;
//         k++;
//         prev= currentele;

//     }
//    }
//    return k;

int n = nums.length;
int count =1;

for(int i =1; i<n; i++){
    if(nums[i] != nums[i-1]){
        nums[count++]=nums[i];
    
    }
}
return count;
    }
}