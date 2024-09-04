class Solution {
    public int reverse(int x) {
        long rev=0;
        boolean ans = true;
        if(x<0){
            ans = false;
            x = -1 * x;
        }
        while(x > 0){
            int pop = x%10;
            rev = rev*10 + pop;
            x = x/10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        if(ans){
            return (int)rev;
        }
        else{
            return -1 * (int)rev;
        }

    }
}