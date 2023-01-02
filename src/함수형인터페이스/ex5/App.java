package 함수형인터페이스.ex5;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class App {
	public static void main(String[] args) {

		// 입력타입과 똑같은 리턴타입
		UnaryOperator<Integer> unaryOperator = (num) -> num * 32;
		System.out.println(unaryOperator.apply(234)); // 7488

		BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2; // 인자 2개
		System.out.println(binaryOperator.apply("안녕", "하세요")); // 안녕하세요

	}
}
