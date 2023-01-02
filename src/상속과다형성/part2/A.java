package 상속과다형성.part2;

public class A {
	public static void main(String[] args) {
		A a = new B();

		B b = (B) a; // 다운캐스팅
		System.out.println(b.n); // 3

		C c = (C) a; // 다운캐스팅
		// System.out.println(c.m); // 에러
	}
}

class B extends A {
	int n = 3;
}

class C extends B {
	int m = 5;
}