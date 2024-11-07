class Solution {
    public int largestCombination(int[] candidates) {
        int max =0;
        int c;
        for(int bit = 0; bit<32 ; bit++){
            c =0;
            for(int num :candidates){
                if((num & (1<<bit))!=0){
                    c++;
                }
                max = Math.max(c,max);
            }
        }
        return max;
    }
}