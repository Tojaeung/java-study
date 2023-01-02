package 함수형인터페이스.ex1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {

		// 입력만 받고 출력안함
		Consumer<String> consumer = System.out::println;
		consumer.accept("나다호다");

		// 인자 2개 받음
		BiConsumer<String, Integer> biConsumer = (String name, Integer age) -> {
			System.out.println("이름: " + name + "/" + "나이: " + age);
		};
		biConsumer.accept("나다호다", 23);

	}
}
