class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        if(m != n) return false;
        String str = s + s;
        if(str.contains(goal)){
            return true;
        }
        return false;
    }
}