package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //create a stream
        Stream<String> stream= Stream.of("a","b","c");
        stream.forEach(System.out::println);

        //create a stream from sources

        Collection<String> stringCollection= Arrays.asList("JAVA","J2EE","SPRING","HIBERNATE");
        Stream<String> stream1=stringCollection.stream();
        stream1.forEach(System.out::println);

    }
}
