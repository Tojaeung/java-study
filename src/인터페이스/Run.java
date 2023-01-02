package 인터페이스;

interface A {
	int n = 3;

	void print();
}

interface B {
	int n = 5;

	void print();
}

// 인터페이스 다중상속 가능...
class C implements A, B {

	// 인터페이스 다중상속시
	// 메서드가 중복되어도 항상 재정의해서 사용해야하기 때문에 모호성이 없다.
	@Override
	public void print() {
		// 인터페이스 필드는 항상 static final이기 때문에 모호성이 없다.
		// A.n;
		// B.n;
	}
}

public class Run {

}
