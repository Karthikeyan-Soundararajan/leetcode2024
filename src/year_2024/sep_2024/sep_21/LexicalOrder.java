package year_2024.sep_2024.sep_21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LexicalOrder {

    public List<Integer> lexicalOrder(int n) {
        return IntStream.range(1,n+1).mapToObj(operand -> {
            return String.valueOf(operand);
        }).sorted((o1, o2) -> o1.compareTo(o2)).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        LexicalOrder lexicalOrder = new LexicalOrder();
        System.out.println(lexicalOrder.lexicalOrder(1300));
    }
}
