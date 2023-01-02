package 상속과다형성.part3;

public class Main3 {
	public static void main(String[] args) {
		A a = new B();
		a.print(); // B 클래스 print 메서드
		a.print2(); // A 클래스 print2 메서드
		// a.print2(5); // 에러
	}
}

class A {
	void print() {
		System.out.println("A 클래스 print 메서드");
	}

	void print2() {
		System.out.println("A 클래스 print2 메서드");
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("B 클래스 print 메서드");
	}

	// 오버로딩 (메서드 이름 같지만 시그니처가 다름)
	void print2(int a) {
		System.out.println("B 클래스 print2 메서드");
	}
}