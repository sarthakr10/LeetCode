// prefix sum array
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int prefix[] = new int[n];
//         int max = Integer.MIN_VALUE;
//         prefix[0] = nums[0];
//         for(int i = 1 ; i<n ;i++){
//             prefix[i] = prefix[i-1]+nums[i];
//         }
//         for(int i =0 ; i<n ;i++){
//             for(int j = i ; j<n ;j++){
//                 int sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
//                 max = Math.max(max,sum);
//             }
            
//         }
//         return max;
//     }
// }
class Solution {
    public int maxSubArray(int[] nums) {
        int cs =0;
        int ms =Integer.MIN_VALUE;
        for(int i =0 ; i<nums.length ;i++){
            cs += nums[i];
            ms = Math.max(cs,ms);
            cs = Math.max(cs,0);            
        }
        return ms;
    }
}