class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        if(n<3){
            return s;
        }
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0)).append(s.charAt(1));
        for(int i =2 ; i<n ; i++){
            if(
                s.charAt(i) != str.charAt(str.length()-1) ||
                s.charAt(i) != str.charAt(str.length()-2)
            ){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}