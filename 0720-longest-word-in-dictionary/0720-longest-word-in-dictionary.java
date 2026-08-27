class TrieNode{
    TrieNode[] child = new TrieNode[26];
    boolean isend;
}

class Solution {

    TrieNode root=new TrieNode();
    String ans="";
    public String longestWord(String[] words) {
        for(String word:words){
            insert(word);
        }
        dfs(root,"");
        return ans;
    }
    


void insert(String word){
    TrieNode current=root;

        for(char ch:word.toCharArray()){
            int index=ch -'a';
            if(current.child[index]==null){
                current.child[index]=new TrieNode();
            }
            current=current.child[index];
        }
        current.isend=true;
}

void dfs(TrieNode current,String word){
    if(word.length()>ans.length()){
        ans=word;
    }
    for(int i=0;i<26;i++){
        if(current.child[i]!=null && current.child[i].isend){
            char c=(char)('a'+i);
            dfs(current.child[i], word + c);

        }
    }
}
}
