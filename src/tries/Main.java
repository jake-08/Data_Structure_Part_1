package tries;

public class Main {
    public static void main(String[] args) {
        var trie = new Tries();
        trie.insert("care");
        trie.insert("car");
        trie.insert("card");
        trie.insert("careful");
        trie.insert("egg");
        var words = trie.findWords(null);
        System.out.println(words);
    }
}
