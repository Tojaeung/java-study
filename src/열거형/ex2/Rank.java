package 열거형.ex2;

public enum Rank {
	// 열거상수를 통해 값이 생성자의 매개변수로 넘어간다.
	// 생성자에의해 힙영역에 객체를 생성한다.
	ONE("토재웅", 100),
	TWO("존", 89),
	THREE("폴", 64);

	final String name;
	final int score;

	Rank(String name, int score) { // Default 생성자는 private 으로 설정되어 있음.
		this.name = name;
		this.score = score;
	}
}
