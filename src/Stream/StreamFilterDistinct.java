package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFilterDistinct {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5, 5, 6};
        IntStream intStream = Arrays.stream(arr);
//        IntStream intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
//        intStream.filter(i -> i%2 ==0).forEach(System.out::print);

        intStream.filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::print);

        System.out.println();
        IntStream intStream2 = Arrays.stream(arr);
        intStream2.filter(i -> i % 2 != 0).filter(i -> i % 3 != 0).forEach(System.out::print);

        System.out.println();
        IntStream intStream3 = Arrays.stream(arr);
//        intStream3.distinct().forEach((i) -> System.out.print(i));
        intStream3.distinct().forEach(System.out::print);


    }

}
