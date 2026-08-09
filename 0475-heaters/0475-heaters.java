class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int ans = Integer.MAX_VALUE;
        int min = 0;
        int max = Math.max(Math.abs(houses[houses.length-1]-heaters[0]), Math.abs(houses[0]-heaters[heaters.length-1]));

        while (min <= max) {
            int mid = min + (max - min) / 2;

            int i = 0;
            int j = 0;
            int c = 0;
            while (i < houses.length && j < heaters.length) {
                if (Math.abs(houses[i]-heaters[j]) <= mid) {
                    c++;
                    i++;
                }   else {
                    j++;
                }
            }

            if (c == houses.length) {
                ans = Math.min(ans, mid);
                max = mid - 1;
            }   else if (c < houses.length) {
                min = mid + 1;
            }
        }
        return ans;
    }
}