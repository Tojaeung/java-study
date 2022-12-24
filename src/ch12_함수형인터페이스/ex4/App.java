package ch12_함수형인터페이스.ex4;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class App {
	public static void main(String[] args) {
		// 함수 입력타입 존재, 출력타입 존재
		Function<String, Integer> function = str -> str.length();
		System.out.println(function.apply("나다호다")); // 4

		// 확장형 입력타입만 고정
		IntFunction<String> intFunction = num -> String.valueOf(num);
		System.out.println(intFunction.apply(345)); // 345 (문자열)

		BiFunction<String, String, Integer> biFunction = (str1, str2) -> (str1 + str2).length();
		System.out.println(biFunction.apply("안녕", "하세요")); // 5

		// 확장형 출력타입만 고정
		ToIntFunction<String> toIntBiFunction = str -> str.length();
		System.out.println(toIntBiFunction.applyAsInt("나다호다")); // 4

	}
}
