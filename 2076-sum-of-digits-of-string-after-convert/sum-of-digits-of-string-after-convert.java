class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str  = new StringBuilder();
        for(char c : s.toCharArray()){
            str.append(c - 'a' + 1);
        }
        while(k>0){
            int temp =0;
            for(char c : str.toString().toCharArray()){
                temp += c - '0';
            }
            str = new StringBuilder(String.valueOf(temp));
            k--;
        }
        return Integer.parseInt(str.toString());
    }
}