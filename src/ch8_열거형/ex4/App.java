package ch8_열거형.ex4;

public class App {
	public static void main(String[] args) {
		// 싱글톤 객체
		// 리플렉션, 직렬화 한계 초월
		Singleton singleton = Singleton.INSTANCE;

		System.out.println(singleton.getName());
		System.out.println(singleton.getAge());
	}
}
