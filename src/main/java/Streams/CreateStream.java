package Streams;

import java.lang.reflect.Array;
import java.util.*;
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

        List<String> list=Arrays.asList("JAVA","J2EE","SPRING","HIBERNATE");
        Stream<String> streamList=list.stream();
        streamList.forEach(System.out::println);

        Set<String> stringSet=new HashSet<>(list);
        Stream<String> setStream=stringSet.stream();
        setStream.forEach(System.out::println);

        String[] strArray={"a","b","c"};
        Stream<String> streamArray=Arrays.stream(strArray);
        streamArray.forEach(System.out::println);


    }
}
