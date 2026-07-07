class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] arr = {-1, -1} ;

        for ( int i = 0 ; i < nums.length ; i++ ) {
            for ( int j = 0 ; j < nums.length ; j++ ) {
                if ( j != i ) {
                    if ( nums[i] + nums[j] == target ) {
                        arr[0] = i ;
                        arr[1] = j ;
                        return arr ;
                    }
                }
            }
        }
        return arr ;
    }
}