package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 생소한 flatMap을 학습
public class Ex2 {

    public static void main(String[] args) {
        Stream<String[]> strStreamStream = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

        // flatMap으로 두 배열을 하나의 배열로 합침
        Stream<String> strStream = strStreamStream.flatMap(Arrays::stream);
        strStream
                .map(String::toLowerCase)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        String[] strArr = {"stream", "apple", "sum"};

        Optional<String> first = Stream.of(strArr)
                .filter(s -> s.charAt(0) == 's')
                .findFirst();

        // Optional의 get메서드는 null일때 널포인트 에러가 날 수 있어서 사용을 지양한다.
        System.out.println(first.get());

        // map을 형변환에 사용
        IntStream intStream = Stream.of(strArr).mapToInt(String::length);
        intStream.forEach(System.out::println);


    }


}
