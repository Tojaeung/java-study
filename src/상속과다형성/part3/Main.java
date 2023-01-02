package 상속과다형성.part3;

public class Main {
	public static void main(String[] args) {
		B b = new B();
		A a = new B();

		b.print(); // B 클래스
		a.print(); // B 클래슨
	}
}

class A {
	void print() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("B 클래스");
	}
}
