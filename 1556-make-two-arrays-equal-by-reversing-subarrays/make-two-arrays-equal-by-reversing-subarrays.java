class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length , m = arr.length;
        if(n != m) return false;
        int count []= new int[1001];
        for(int i =0 ;i<n ; i++){
            count[arr[i]]++;
            count[target[i]]--;
        }
        for (int i = 0; i < n; i++) {
            if (count[target[i]] != 0 || count[arr[i]] != 0) {
                return false;
            }
        }
        return true;
    }
}