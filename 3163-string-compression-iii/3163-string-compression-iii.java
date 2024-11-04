class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder();
        int c = 1; 
        int n = word.length();
        char ch = word.charAt(0);
        for(int i = 1 ; i<n ; i++){
            if(word.charAt(i) == ch && c<9){
                c++; 
            }else{
                str.append(c).append(ch);
                ch = word.charAt(i);
                c=1;
            }
        }
        str.append(c).append(ch);
        return str.toString();
        
    }
}