class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> paraens = new ArrayList<>();
        backtrack(n,paraens, new StringBuilder(),0,0);
        return paraens;
    }
    public void backtrack(int n, List<String> paraens, StringBuilder sb, int open, int closed){
        if(sb.length() == n*2){
            paraens.add(sb.toString());
            return;
        }
        if(open < n){
        sb.append("(");
            backtrack(n,paraens, sb,open+1,closed);
            sb.deleteCharAt(sb.length() - 1);
            
        }
        if(closed < open){
        sb.append(")");
            backtrack(n,paraens, sb,open,closed+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}