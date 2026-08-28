class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        {
            int j = 1;
            for (int i = 0; i < n; i++) {
                list.add(j);
                j++;
            }
        }
        return winner(list, k, 0);
    }

    public int winner(List<Integer> list, int k, int currInd) {
        if (list.size() == 1) {
            return list.get(0);
        }
        int index = currInd + k - 1;
        index = (index % list.size());
        list.remove(index);
        index = index % list.size();
        
        return winner(list, k, index);
    }    
}