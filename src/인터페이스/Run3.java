package 인터페이스;

interface A {
	void print();

	// default 메서드
	default void print2() {
		System.out.println("안녕");
	};
}

class B implements A {
	// print2 default메서드는 재정의 안되었다.
	@Override
	public void print() {
		A.super.print2(); // 특이한 default 메서드 호출법
	}
}

public class Run3 {
	public static void main(String[] args) {
		B b = new B();
		b.print2(); // default 메서드 호출
	}
}
