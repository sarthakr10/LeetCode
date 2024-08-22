class Solution {
    public int findComplement(int num) {
        int i =0 ;
        int ans =0;
        while(num>0){
            int c = num & 1;
            if(c == 0){
                ans += Math.pow(2,i);
            }
            num = num>>1;
            i++;
        }
        return ans;
    }
}