class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int srow = 0;
        int scolumn= 0;
        int endc = matrix[0].length-1;
        int endr = matrix.length-1;
        while(srow <= endr && scolumn<= endc){
            //top
            for(int j =scolumn ; j<=endc ;j++){
                list.add(matrix[srow][j]);
            }
            //right
            for(int i = srow +1 ; i<= endr ; i++){
                list.add(matrix[i][endc]);
            }
            //bottom
            for(int j = endc - 1 ; j>= scolumn ;j--){
                if(endr == srow){
                    break;
                }
                list.add(matrix[endr][j]);
            }
            //left
            for(int i = endr -1 ; i>= srow+1 ;i--){
                if(scolumn == endc){
                    break;
                }
                list.add(matrix[i][scolumn]);
            }
            srow++;
            scolumn++;
            endc--;
            endr--;
        }
        return list;
    }
}