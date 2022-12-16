package ch7_이너클래스;

public class A {
	class B { // 인스턴스 멤버 클래스

	}

	static class C { // 정적 멤버 클래스

	}

	void method() {
		class D { // 지역 이너클래스 (메서드 안의 클래스)

		}
	}
}
