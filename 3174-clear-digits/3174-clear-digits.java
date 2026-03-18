class Solution {
    public String clearDigits(String s) {
        Stack <Character> stk = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch) && !stk.isEmpty()) {
                stk.pop();
            } else
                stk.push(ch);
        }
        String result = "";

        for (char c : stk) {
            result += c;
        }
        return result;
    }   
}