package ch4_상속과다형성.part5;

public class Main3 {
	public static void main(String[] args) {
		A a = new A();
		System.out.printf("%x\n", a.hashCode()); // 해쉬코드 5acf9800
		System.out.println(a); // 패키지.클래스@해쉬코드

		B b = new B();
		System.out.println(b); // toString 자동실행
	}
}

class A {
	int n = 3;
	int m = 5;
}

class B {
	int n = 3;
	int m = 5;

	@Override
	public String toString() {
		return "B {n=" + n + ", m=" + m + "}";
	}

}