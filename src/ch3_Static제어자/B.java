package ch3_Static제어자;

public class B {
	private static int n = 3;

	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();

		System.out.println(b1.n); // 3
		System.out.println(b2.n); // 3

		// 인스턴스 객체들은 static 정적필드를 공유하고 있다.
		b1.n = 5;
		System.out.println(b1.n); // 5
		System.out.println(b2.n); // 5
	}
}
