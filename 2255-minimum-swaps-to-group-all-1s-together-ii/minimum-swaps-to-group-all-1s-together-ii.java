class Solution {
    public int minSwaps(int[] nums) {
        int total = 0;
        int n = nums.length;
        for(int i =0 ; i<n ;i++){
            if(nums[i] == 1) total++;
        }
        int i =0;
        int j =0;
        int currone = 0;
        int maxone = 0;
        while(j<2*n){
            if(nums[j%n] == 1) currone++;

            if(j - i + 1 > total){
                currone -= nums[i%n];
                i++;
            } 
            j++;
            maxone = Math.max(maxone,currone);
        }
        return total - maxone;
    }
}