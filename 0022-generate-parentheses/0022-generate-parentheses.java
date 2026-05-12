class Solution {
    void solve(List<String>res,String curr,int n,int close,int open){
        if(close==0 && open==0){
            res.add(curr);
            return;
        }
        if(open>0)solve(res,curr+"(",n-1,close,open-1);
        if(close>open)solve(res,curr+")",n-1,close-1,open);
    }
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        solve(res,"",n,n,n);
        return res;
    }
}