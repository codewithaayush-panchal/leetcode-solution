class Solution {
    public String longestCommonPrefix(String[] strs) {
        if ( strs.length == 0 ) {
            return "" ;
        }
        int a = 1;
        int min_len = Integer.MAX_VALUE;
        StringBuilder x = new StringBuilder();
        for ( int i = 0; i < strs.length; i++ ) {
            min_len = Math.min(min_len, strs[i].length());
        }
        for ( int i = 0; i < min_len; i++ ) {
            a = 1;
            for ( int j = 0; j < strs.length-1; j++ ) {
                if ( strs[j].charAt(i) == strs[j+1].charAt(i) ) {
                    a++;
                }
            }
            if ( a == strs.length ) {
                x.append(strs[0].charAt(i));
            }   else {
                return x.toString();
            }
        }
        return x.toString();
    }
}