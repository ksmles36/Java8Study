package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamMap {

    public static void main(String[] args) {

        File[] files = {new File("Ex11.java"), new File("Ex1"), new File("Ex11111.back"),
                new File("Ex2.java"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(files);

//        fileStream.map(i -> i.getName())
        fileStream.map(File::getName)
                .filter(s -> s.indexOf(".") != -1)
                .map(s -> s.substring(s.indexOf(".")+1))
                .map(String::toUpperCase)
                .distinct()
                .forEach(i -> System.out.print(i + " "));

//        fileStream.map(i -> i.getName())
//                .filter(s -> s.indexOf(".") != -1)  //확장자 없는 것들 제외
//                .forEach(s -> System.out.println(s.indexOf(".")+1));


    }


}
