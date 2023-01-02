package 람다.ex1;

public class App {
	public static void main(String[] args) {
		// 익명이너클래스
		Person person = new Person() {
			@Override
			public void sleep(String 잠꼬대) {
				System.out.println(잠꼬대);
			}
		};
		person.sleep("나다호다");

		// 람다
		Person person2 = (String 잠꼬대) -> System.out.println(잠꼬대);
		person2.sleep("나다호다2");

		// 메서드 참조
		Person person3 = System.out::println;
		person3.sleep("나다호다3");
	}
}
