package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {

        // list를 스트림할때는 IntStream 타입 사용 못함
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();
        intStream.forEach(System.out::println);

        // 배열을 스트림할때 IntStream 메서드들을 사용할 수 있음 (편리한 메서드 사용해서 좋다.)
        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(intArr);
        System.out.println(intStream1.sum());

        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        // 난수 스트림 만들기
        IntStream intStream2 = new Random().ints(10);   // 10개의 난수
        System.out.println(
                intStream2
                        .limit(5)
                        .reduce(1, (a, b) -> a * b));

    }
}
