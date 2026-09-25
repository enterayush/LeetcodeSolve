class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Stack<Character> stack = new Stack<>();
        boolean[] used = new boolean[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']--;
            if(used[c - 'a']) {
                continue;
            }

            while(!stack.isEmpty() &&
                  stack.peek() > c &&
                  freq[stack.peek() - 'a'] > 0) {

                used[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            used[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for(char c : stack) {
            ans.append(c);
        }

        return ans.toString();
    }
}