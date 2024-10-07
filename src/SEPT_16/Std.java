package SEPT_16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getMarks(){
        return this.marks;
    }
}

public class Std {
    public static void main(String[] args) {
//        List<Student> studs = new ArrayList<>(){{
//            add(new Student(56,"shwetank", 900));
//            add(new Student(56,"shubham", 1000));
//            add(new Student(56,"siddham", 950));
//            add(new Student(56,"sahu", 800));
//            add(new Student(56,"sidhant", 930));
//        }};
//        Stream<Student> newstrm = studs.stream().filter((s) -> s.getMarks() > 800);
//        List<Student> res = newstrm.collect(Collectors.toList());
//        res.forEach(s-> System.out.println(s));

        List<String> names = new ArrayList<>(){{
            add("Shwetank");
            add("Shubham");
            add("Sidhant");
            add("Siddham");
        }};
        List<String> res = names.stream().map(s->"Welcome " + s).toList();
        res.forEach(System.out::println);
    }
}
