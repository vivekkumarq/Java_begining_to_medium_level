package LeetcodePractice;

class Trie {

    private TrieNode root;

   
    private static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

  
    public Trie() {
        root = new TrieNode();
    }


    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a'; 
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }


    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEndOfWord;
    }

    
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }


    private TrieNode searchPrefix(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null)
                return null;
            node = node.children[index];
        }
        return node;
    }

     public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println("search(\"apple\"): " + trie.search("apple"));  
        System.out.println("search(\"app\"): " + trie.search("app"));       
        System.out.println("startsWith(\"app\"): " + trie.startsWith("app"));
        trie.insert("app");
        System.out.println("search(\"app\"): " + trie.search("app"));       
    }
}

