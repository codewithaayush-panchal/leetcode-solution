class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();
        
        int a = 1;
        for (int i = 0; i < rowIndex+1; i++) {
            arr.add(new ArrayList<>());
            for (int j = 0; j < a; j++) {
                if(j == 0 || j == a - 1) {
                    arr.get(i).add(1);
                }   else {
                    arr.get(i).add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
            }
            a++;
        }
        return arr.get(rowIndex);
    }
}