class Solution {
    public int check(String s){
        String st = "aeiou";
        int n = s.length()-1;
        String c1 = String.valueOf(s.charAt(0));
        String c2 = String.valueOf(s.charAt(n));
        if(st.contains(c1) && st.contains(c2)){
            return 1;
        }
        else return 0;
    } 
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] prefix = new int[words.length+1];
        int pre =0;
        for(int i = 0 ; i<words.length ; i++){
            prefix[i+1] = prefix[i] +check(words[i]);
        }
        int ans [] = new int[queries.length];
        for(int i =0 ; i<queries.length;i++){
            int a = queries[i][0];
            int b = queries[i][1];
            ans [i] = prefix[b+1] - prefix[a];
        }
        return ans;
    }
}