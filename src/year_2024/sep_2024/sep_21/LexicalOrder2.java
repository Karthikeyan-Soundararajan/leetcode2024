package year_2024.sep_2024.sep_21;

import java.util.ArrayList;
import java.util.List;

public class LexicalOrder2 {
    List<Integer> result = new ArrayList<>();
    public  List<Integer> lexicalOrder(int n) {
        generateLexicalOrder(0,n);
        return result;
    }

    private void generateLexicalOrder(int start, int limit) {
        for (int i = start; i <= Math.min(start+9,limit); i++) {
            if (i==0)
                continue;
            result.add(i);
            generateLexicalOrder(10*i,limit);
        }
    }

    public static void main(String[] args) {
        LexicalOrder2 lexicalOrder2 = new LexicalOrder2();
        System.out.println(lexicalOrder2.lexicalOrder(100));
    }
}
