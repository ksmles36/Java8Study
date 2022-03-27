package functionPackage;

import java.util.function.Function;

public class MethodReference {

    public static void main(String[] args) {

        Function<String, Integer> f1 = s -> Integer.parseInt(s);

        Function<String, Integer> f2 = Integer::parseInt;

    }
}
