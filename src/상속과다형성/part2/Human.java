package 상속과다형성.part2;

public class Human {
	String name;
	int age;

	void eat() {
	}

	public static void main(String[] args) {
		// Human, Worker의 멤버를 모두 시용가능
		Worker worker = new Worker();

		// Human의 멤버만 사용가능
		Human human = new Worker();
		// human.workerId; // 에러
		// human.work(); // 에러
	}
}

class Worker extends Human {
	int workerId;

	void work() {
	}
}
