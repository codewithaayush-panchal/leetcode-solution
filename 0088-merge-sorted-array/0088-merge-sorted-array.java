class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m ;
        for ( int i = 0; i < n; i++ ) {
            nums1[m] = nums2[i] ;
            m++ ;
        }
        for ( int j = 0; j < k + n; j++ ) {
            for ( int i = 1; i < k + n; i++ ) {
                if ( nums1[i] < nums1[i-1] ) {
                    int temp = nums1[i];
                    nums1[i] = nums1[i-1];
                    nums1[i-1] = temp;
                }
            }
        }
    }
}