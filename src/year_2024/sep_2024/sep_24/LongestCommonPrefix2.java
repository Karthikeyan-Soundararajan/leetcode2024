package year_2024.sep_2024.sep_24;

public class LongestCommonPrefix2 {

    private class Trie {
        Trie[] children = new Trie[10];
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie root = new Trie();
        for (int n : arr1) {
            int multi = multi(n);
            Trie parent = root;
            while(multi > 0) {
                int d = (n/multi) % 10;
                if (parent.children[d] == null) parent.children[d] = new Trie();
                parent = parent.children[d];
                multi /= 10;
            }
        }

        int maxLen = 0;
        for (int n : arr2) {
            int multi = multi(n);
            int len = 0;
            Trie parent = root;
            while (multi > 0) {
                int d = (n/multi) % 10;
                parent = parent.children[d];
                if (parent == null) break;
                len++;
                maxLen = Math.max(maxLen, len);
                multi /= 10;
            }
        }
        return maxLen;
    }

    private int multi(int n) {
        int mult = 1;
        while (mult * 10 <= n) {
            mult = mult * 10;
        }
        return mult;
    }

    public static void main(String[] args) {
        LongestCommonPrefix2 commonPrefix = new LongestCommonPrefix2();
        System.out.println(commonPrefix.longestCommonPrefix(new int[]{1,10,100}, new int[]{1000}));
//        System.out.println(commonPrefix.longestCommonPrefix(new int[]{1,2,3}, new int[]{4,4,4}));
//        System.out.println(commonPrefix.longestCommonPrefix(new int[]{34}, new int[]{39}));
    }
}
