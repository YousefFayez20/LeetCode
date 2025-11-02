class WordDictionary {
    class TrieNode{
        boolean word;
        Map<Character,TrieNode> children = new HashMap<>();
    }
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray()){
            if(!curr.children.containsKey(c)){
                curr.children.put(c,new TrieNode());
            }
            curr = curr.children.get(c);
        }
        curr.word = true;
        
    }
    private boolean dfs(String word, int index,TrieNode node){
        if(index == word.length()){
            return node.word;
        }
        char c = word.charAt(index);
        if(c=='.'){
            for(TrieNode child:node.children.values()){
                if(dfs(word,index+1,child)){
                    return true;
                }
            }
            return false;
        }else{
            TrieNode next = node.children.get(c);
            if (next == null) {
                return false;
            }
            return dfs(word, index + 1, next);
        }
    }
    public boolean search(String word) {
       return dfs(word, 0, root);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */