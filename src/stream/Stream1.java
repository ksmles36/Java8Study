package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("김자바", 3, 300),
                new Student("이자바", 2, 200),
                new Student("박자바", 1, 100),
                new Student("최자바", 3, 300),
                new Student("강자바", 2, 200),
                new Student("고자바", 1, 100),
                new Student("양자바", 3, 300)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder())
                .thenComparing(Comparator.comparing(Student::getName)))
                .forEach(s -> System.out.println(s));
    }


}
