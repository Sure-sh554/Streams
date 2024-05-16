package Streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamObjectFromArrays {

    public static void main(String[] args) throws IOException {
        // Array can also be a source of stream
        Stream<String> streamOfArray= Stream.of("a","b","c");
        streamOfArray.forEach(System.out::println);

        // Creating from existing array  or of a part of an array

        String[] arr=new String[]{"a","b","c"};
        Stream<String> streamOfFullArray= Arrays.stream(arr);
        streamOfFullArray.forEach(System.out::println);

        Stream<String> streamOfArrayPart=Arrays.stream(arr,1,2);
        streamOfArrayPart.forEach(System.out::println);


    }
}
