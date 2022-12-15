package ch4_상속과다형성.part4;

public class Main3 {
	public static void main(String[] args) {
		B b = new B();
		// b.print(); // B 클래스 print 메서드

		// 오버라이딩 되지 않는다.
		A a = new B();
		// a.print(); // A 클래스 print 메서드
	}
}

class A {
	static void print() {
		System.out.println("A 클래스 print 메서드");
	};
}

class B extends A {
	static void print() {
		System.out.println("B 클래스 print 메서드");
	};
}