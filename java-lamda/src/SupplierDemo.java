import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static List<Integer> makeIntList(Supplier<Integer> s, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(s.get());
        }
        return list;
    }

    public static void main(String[] args) {
        Supplier<Integer> s;
        s=() -> {
            Random random = new Random();
            return random.nextInt(10);
        };

        System.out.println(makeIntList(s, 4));

    }
}
