class Solution {
    public String countAndSay(int n) {
        return rle(n);
    }

    static String rle(int n) {
        if (n == 1) {
            String z  = "1";
            return z;
        }

        String s = rle(n-1);

        if (s.equals("1")) {
            String y = "11";
            return y;
        }   else {
            int c = 1;
            StringBuilder temp = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1) && i+1 == s.length()) {
                    c++;
                    temp.append((char) (c + '0'));
                    temp.append(s.charAt(i - 1));
                } else if (s.charAt(i) == s.charAt(i-1)) {
                    c++;
                } else {
                    if (i+1 == s.length()) {
                        temp.append((char) (c + '0'));
                        temp.append(s.charAt(i - 1));
                        temp.append('1');
                        temp.append(s.charAt(s.length()-1));
                    }   else {
                        temp.append((char) (c + '0'));
                        temp.append(s.charAt(i - 1));
                        c = 1;
                    }
                }
            }
            s = temp.toString();
        }

        return s;
    }

}