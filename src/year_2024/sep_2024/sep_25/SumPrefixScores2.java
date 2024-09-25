package year_2024.sep_2024.sep_25;

import java.util.Arrays;

class TrieNode{
    TrieNode[] next = new TrieNode[26];
    int cnt;
}

public class SumPrefixScores2 {

    TrieNode root = new TrieNode();
    public int[] sumPrefixScores(String[] words) {
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        int[] result = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = count(words[i]);
        }
        return result;
    }

    private int count(String word) {
        int result = 0;
        TrieNode node = root;
        for (char c : word.toCharArray()){
            result += node.next[c-'a'].cnt;
            node = node.next[c-'a'];
        }
        return result;
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char c:word.toCharArray()) {
            if (node.next[c-'a']==null){
                node.next[c-'a'] = new TrieNode();
            }
            node.next[c-'a'].cnt++;
            node = node.next[c-'a'];
        }
    }

    public static void main(String[] args) {
        SumPrefixScores2 sumPrefixScores2 = new SumPrefixScores2();
//        System.out.println(Arrays.toString(sumPrefixScores2.sumPrefixScores(new String[]{"abc","ab","bc","b"})));
        System.out.println(Arrays.toString(sumPrefixScores2.sumPrefixScores(new String[]{"abcd"})));
    }
}
