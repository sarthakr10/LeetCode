class Solution {
    public int minimumPushes(String word) {
        int lfreq[] = new int[26];
        int count =0;
        for(Character c: word.toCharArray()){
            lfreq[c - 'a']++;
        }
        Integer freq[] = new Integer[26];
        for(int i =0 ; i<26; i++){
            freq[i] = lfreq[i];
        }
        Arrays.sort(freq , Collections.reverseOrder());
        for(int i =0 ; i<26 ; i++){
            if(freq[i] == 0) break;
            int a = freq[i];
            count += (i/8 + 1)*freq[i];
        }
        return count;
    }
}