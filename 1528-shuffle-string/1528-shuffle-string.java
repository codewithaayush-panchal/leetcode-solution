class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for ( int i = 0 ; i < result.length ; i++ ) {
            result[indices[i]] = s.charAt(i) ;
        }

        return new String(result) ;
    }
}