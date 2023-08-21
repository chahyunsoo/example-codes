import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static int sum(Predicate<Integer> i, List<Integer> list) {
        int s=0;
        for (int n : list) {
            if (i.test(n)) {
                s += n;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 6, 4, 9, 2);
        int s = sum((n) -> n % 2 == 0, list);
        System.out.println(s);

    }
}
