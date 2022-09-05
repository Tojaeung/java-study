package stream;

import java.util.Optional;

// Optional 공부
public class Ex3 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.empty();    // Optional 초기화

        opt = Optional.of("abc");   // Optional 할당

        String s = opt.orElse("");  // 만약 Optional 안에 값이 null이라면 공백문자
        System.out.println(s);

        // 만약 Optional이 null이 아니라면 발동
        opt.ifPresent(System.out::println);
        // Optional이 null이 아니라면 true
        System.out.println(opt.isPresent());


    }
}
