class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length){
            return new int[0][];
        }
        int [][] ar = new int[m][n];
        int x = 0;
        for(int i =0 ; i<m ; i++){
            for(int j =0 ; j<n ; j++){
                ar[i][j] = original[x++];
            }
        }
        return ar;
    }
}