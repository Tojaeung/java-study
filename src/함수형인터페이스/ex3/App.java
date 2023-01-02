package 함수형인터페이스.ex3;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {

		// 입력값을 받고 리턴값은 불린
		Predicate<String> predicate = (str) -> str.length() > 2 ? true : false;
		System.out.println(predicate.test("나다호다")); // true

		// 확장형
		IntPredicate intPredicate = (num) -> num > 43 ? true : false;
		System.out.println(intPredicate.test(34)); // false

		BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1 + num2 > 564 ? true : false;
		System.out.println(biPredicate.test(342, 345)); // true

	}
}
