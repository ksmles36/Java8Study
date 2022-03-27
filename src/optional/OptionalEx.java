package optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx {

    public static void main(String[] args) {

        Optional<String> optStr = Optional.of("abcdefg");
        Optional<Integer> optInt = optStr.map(i -> i.length());
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());



        int result1 = Optional.of("123")
                .filter(i -> i.length() > 0)
                .map(i -> Integer.parseInt(i)).get();
        int result2 = Optional.of("")
                .filter(i -> i.length() > 0)
                .map(Integer::parseInt).orElseGet(() -> 999);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);



        Optional.of("456")
//                .map(i -> Integer.parseInt(i))
                .map(Integer::parseInt)
                .ifPresent(i -> System.out.println("result = " + i));



        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();
        System.out.println(optInt1.isPresent());
        System.out.println(optInt2.isPresent());

        System.out.println(optInt1.getAsInt());
//        System.out.println(optInt2.getAsInt());
        System.out.println("optInt1 = " + optInt1.toString());
        System.out.println("optInt2 = " + optInt2.toString());
        System.out.println("optInt1.equals(optInt2) ? " + optInt1.equals(optInt2));

    }

}
