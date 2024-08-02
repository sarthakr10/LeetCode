class Solution {
    public int minSwaps(int[] nums) {
        int total = 0;
        int n = nums.length;
        int arr[] = new int[2*n];
        for(int i =0 ; i<n ; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
            if(nums[i] == 1) total++;
        }
        int i =0 ;
        int j =0;
        int currone = 0;
        int maxcount =0;
        while(j<2*n){
            if(arr[j] == 1) currone++;
            
            if(j - i +1 >total){
                currone -= arr[i];
                i++;
            }
            maxcount = Math.max(maxcount,currone);
            j++;
        }
        return total - maxcount;
    }
}