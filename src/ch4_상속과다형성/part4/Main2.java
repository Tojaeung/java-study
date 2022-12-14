package ch4_상속과다형성.part4;

public class Main2 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.m); // 4

		// 오버라이딩 되지 않는다.
		A a = new B();
		System.out.println(a.m); // 3
	}
}

class A {
	static int m = 3;
}

class B extends A {
	static int m = 4;
}
