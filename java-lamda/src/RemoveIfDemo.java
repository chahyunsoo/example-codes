import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfDemo {
    public static void main(String[] args) {
        List<Integer> ilist = Arrays.asList(1, 3, 5, 7, 9);
        ilist = new ArrayList<>(ilist);

        Predicate<Number> p = (number -> {
            return number.intValue() > 2;
        });
        ilist.removeIf(p);
        System.out.println(ilist); //1만 남음

    }
}
