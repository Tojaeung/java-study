package ch4_상속과다형성.part5;

public class Main4 {
	public static void main(String[] args) {
		A a1 = new A("안녕");
		A a2 = new A("안녕");

		// stack 위치값 비교
		System.out.println(a1 == a2); // false
		System.out.println(a1.equals(a2)); // false

		B b1 = new B("안녕");
		B b2 = new B("안녕");

		// stack 위치값 비교
		System.out.println(b1 == b2); // false
		// 필드값 비교
		System.out.println(b1.equals(b2)); // true
	}
}

class A {
	String name;

	public A(String name) {
		this.name = name;
	}
}

class B {
	String name;

	public B(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof B) {
			if (this.name == ((B) obj).name) {
				return true;
			}
		}
		return false;
	}

}