class Solution {
    public List<String> letterCombinations(String digits) {
        return combinations(digits, "");
    }

    static List<String> combinations(String num, String p) {
        List<String> ans = new ArrayList<>();
        if (num.length() == 0) {
            ans.add(p);
            return ans;
        }

        int digit = num.charAt(0) - '0';

        if (digit <= 6) {
            StringBuilder x = new StringBuilder();
            x.append(p);
            for (int i = 0; i <= 2; i++) {
                char c = (char)(97 + (digit-2) * 3 + i);
                ans.addAll(combinations(num.substring(1), p + c));
                p = x.toString();
            }
        }   else if (digit == 7) {
            StringBuilder x = new StringBuilder();
            x.append(p);
            for (int i = 0; i <= 3; i++) {
                char c = (char)(97 + (digit-2) * 3 + i);
                ans.addAll(combinations(num.substring(1), p + c));
                p = x.toString();
            }
        }   else if (digit == 8) {
            StringBuilder x = new StringBuilder();
            x.append(p);
            for (int i = 0; i <= 2; i++) {
                char c = (char)(116 + i);
                ans.addAll(combinations(num.substring(1), p + c));
                p = x.toString();
            }
        }   else {
            StringBuilder x = new StringBuilder();
            x.append(p);
            for (int i = 0; i <= 3; i++) {
                char c = (char)(119 + i);
                ans.addAll(combinations(num.substring(1), p + c));
                p = x.toString();
            }
        }

        return ans;

    }

}