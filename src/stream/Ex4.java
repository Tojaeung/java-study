package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    String name;
    Boolean isMale;
    int hak;
    int ban;
    int score;

    public Student(String name, Boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }

    enum Level {HIGH, MID, LOW}
}

public class Ex4 {
    public static void main(String[] args) {
        Student[] strArr = {
                new Student("김재웅", true, 1, 1, 300),
                new Student("기마차", false, 2, 1, 200),
                new Student("라파다", true, 1, 1, 30),
                new Student("라팍", false, 2, 1, 100),
                new Student("러퍄가", true, 1, 1, 50),
                new Student("파당랴", false, 2, 1, 47)
        };


        Stream<Student> studentStream = Stream.of(strArr);

        Map<Boolean, Long> collect = studentStream
                .collect(Collectors.partitioningBy((student -> student.isMale), Collectors.counting()));
        System.out.println(collect.keySet());
        System.out.println(collect.values());


        // 스트림은 iterator과 같이 일회용이다. 그래서 스트림을 다시 할당해주었다.
        studentStream = Stream.of(strArr);
        Map<Boolean, List<Student>> collect1 = studentStream
                .collect(Collectors.partitioningBy((student -> student.getScore() > 100)));
        System.out.println(collect1.get(true));

        // 스트림은 iterator과 같이 일회용이다. 그래서 스트림을 다시 할당해주었다.
        studentStream = Stream.of(strArr);
        Map<Integer, List<Student>> collect2 = studentStream
                .collect(Collectors.groupingBy(Student::getHak));
        System.out.println(collect2.keySet());
        System.out.println(collect2.values());
        System.out.println(collect2.get(1));
        System.out.println(collect2.get(2));
        
        collect2.get(2).stream().forEach(System.out::println);


    }
}
