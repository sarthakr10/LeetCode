class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxfreq = 0;
        int left = 0 ;
        long sum =0;

        for(int right = 0 ; right<nums.length ; right++){
            sum += nums[right];

            while((long) nums[right] * (right - left +1) > sum + k){
                sum -= nums[left];
                left++;
            }
            maxfreq = Math.max(maxfreq , right - left + 1);
        }
        return maxfreq;
    }
}