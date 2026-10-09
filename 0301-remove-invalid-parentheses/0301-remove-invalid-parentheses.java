class Solution {
    boolean isValid(String s){
        int cnt=0;
        for(char c: s.toCharArray()){
            if(c =='('){
                cnt++;
            }
            else if (c == ')'){
                cnt--;
            }
            if(cnt < 0) return false;
            
        }
        return cnt == 0;
    }
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        boolean found = false;
        queue.offer(s);
        visited.add(s);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i =0;i<size;i++){
                String curr = queue.poll();

                if(isValid(curr)){
                    result.add(curr);
                    found = true;
                }
                if(found){
                    continue;
                }
                for (int j = 0; j < curr.length(); j++){
                    if(curr.charAt(j) != '(' && curr.charAt(j) != ')'){
                        continue;
                    }
                    String next = curr.substring(0,j) + curr.substring(j+1);
                    if(!visited.contains(next)){
                        visited.add(next);
                        queue.offer(next);
                    }
                    if(found) break;
                }
            }
        }
        return result;

    }
}