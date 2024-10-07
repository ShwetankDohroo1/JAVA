package SEPT_16;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(){{
            add("shwetank");
            add("goyal");
            add("jain");
            add("bhadurya");
        }};
//        Consumer<String> c = s -> System.out.println(s);  1
        Stream<String> strm = names.stream();
//        strm.forEach(c);  1
//        strm.forEach(s-> System.out.println(s));  2
        names.stream().forEach(s -> System.out.println(s)); // 3 fetching new stream api
    }
}
