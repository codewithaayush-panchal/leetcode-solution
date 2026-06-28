class Solution {
    public String interpret(String command) {
        String ans = command.replace("()", "o") ;
        String result = ans.replace("(al)", "al") ;
        return result ;
    }
}