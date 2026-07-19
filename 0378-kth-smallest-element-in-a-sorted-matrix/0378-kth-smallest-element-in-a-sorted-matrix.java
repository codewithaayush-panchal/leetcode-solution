class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> merged = new ArrayList<>(Arrays.stream(matrix[0]).boxed().toList());
        List<Integer> down = new ArrayList<>();
        for (int i = 1; i < matrix.length; i++) {
            List<Integer> up = new ArrayList<>(merged);
            down = Arrays.stream(matrix[i]).boxed().toList();
            merged.clear();
            int j = 0; 
            int m = 0;
            int l = 0;
            while (j < up.size() && m < down.size()) {
                if (up.get(j) <= down.get(m)) {
                    merged.add(up.get(j));
                    j++;
                }   else {
                    merged.add(down.get(m));
                    m++;
                }
            }
            while (j < up.size()) {
                merged.add(up.get(j));
                j++;
            }  
            while (m < down.size()) {
                merged.add(down.get(m));
                m++;
            }
        }
        return merged.get(k-1);
    }
}