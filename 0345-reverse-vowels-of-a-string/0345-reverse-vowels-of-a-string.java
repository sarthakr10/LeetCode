class Solution {
    public boolean check(char s){
        if(s=='a' || s=='A' || s=='e' || s=='E' || s== 'i' || s=='I' ||s=='o'||s=='O' || s=='u' || s=='U'){
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int st = 0;
        int ed = arr.length-1;
        while(st<ed){
            while(st<ed && !check(arr[st])){
                st++;
            }
            while(st<ed && !check(arr[ed])){
                ed--;
            }
            char temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
        return new String(arr);
    }
}