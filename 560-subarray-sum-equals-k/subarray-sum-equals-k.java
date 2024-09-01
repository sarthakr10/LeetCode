class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0 , presum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : nums){
            presum += i;
            if(map.containsKey(presum - k)){
                ans += map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return ans;
    }
}