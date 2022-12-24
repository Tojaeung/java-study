package ch12_함수형인터페이스.ex2;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class App {
	public static void main(String[] args) {

		// 입력없이 공급만 해준다.
		Supplier<String> supplier = () -> "나다호다";
		System.out.println(supplier.get());

		// 확장형
		BooleanSupplier supplier2 = () -> false; // 입력 없음, 불린 리턴
		IntSupplier supplier3 = () -> 43; // 입력없음, int 리턴
		System.out.println(supplier2.getAsBoolean()); // false
		System.out.println(supplier3.getAsInt()); // 43

	}
}
