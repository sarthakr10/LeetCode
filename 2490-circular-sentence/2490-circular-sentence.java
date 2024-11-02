class Solution {
    public boolean isCircularSentence(String sentence) {
        String str[] = sentence.split(" ");
        int n = str.length;
        char last = str[n-1].charAt(str[n-1].length()-1);
        for(int i = 0 ; i<n ; i++){
            if(str[i].charAt(0) != last) return false;
            last = str[i].charAt(str[i].length()-1);
        }
        return true;
    }
}