class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> added = new HashSet<>();
        List<String> li = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(sb.length()>10){
                sb.deleteCharAt(j);
                
            }
            if(sb.length()==10){
                if(set.contains(sb.toString())){
                    if(!added.contains(sb.toString())) {
                        li.add(sb.toString());
                        added.add(sb.toString());
                    }
                }
                else{
                    set.add(sb.toString());
                }
            }
        

        }
        return li;
    }
}