import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f= (s) -> {
            return s.length();
        };
        System.out.println(f.apply("functiondemo"));
    }
}
