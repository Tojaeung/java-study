package ch8_열거형.ex2;

public class App {
	public static void main(String[] args) {
		// 열거상수는 힙영역의 객체주소값을 참조하고 있다.
		Rank rank = Rank.THREE;

		System.out.println(rank);
		System.out.println(rank.name);
		System.out.println(rank.score);

	}
}
