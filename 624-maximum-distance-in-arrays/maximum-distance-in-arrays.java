class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
      int s = arrays.get(0).get(0);
      int l = arrays.get(0).get(arrays.get(0).size()-1);
      int max =0;
      for(int i =1 ; i<arrays.size() ; i++){
        max = Math.max(max,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-s));
        max = Math.max(max,Math.abs(l - arrays.get(i).get(0)));
        s = Math.min(arrays.get(i).get(0),s);
        l = Math.max(l,arrays.get(i).get(arrays.get(i).size()-1));
      }
      return max;
    }
}