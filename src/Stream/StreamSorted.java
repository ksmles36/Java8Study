package Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSorted {

    public static void main(String[] args) {

        String[] strArr = {"dd", "aaa", "CC", "cc", "b"};

        Stream<String> strStream1 = Stream.of(strArr);
        strStream1.sorted().forEach((i) -> System.out.print(i));

        System.out.println();
        Stream<String> strStream2 = Stream.of(strArr);
        strStream2.sorted(Comparator.reverseOrder()).forEach(System.out::print);

        System.out.println();
        Stream<String> strStream3 = Stream.of(strArr);
        strStream3.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::print);


    }

}
