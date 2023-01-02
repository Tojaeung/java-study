package 상속과다형성.part4;

public class Main {
	public static void main(String[] args) {
		// 바깥 객체부터 탐색한다.
		B b = new B();
		System.out.println(b.n); // 3

		// 인스턴스 필드는 오버라이딩 되지 않는다.
		A a = new B();
		System.out.println(a.n); // 2
	}
}

class A {
	int n = 2;
}

class B extends A {
	int n = 3;
}
