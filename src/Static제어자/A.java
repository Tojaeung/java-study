package Static제어자;

public class A {
	private static int n = 3;
	private int m = 5;

	public static void main(String[] args) {
		// static 필드
		System.out.println(A.n); // 3

		// 인스턴스 필드
		A a = new A();
		System.out.println(a.m); // 5
		// 인스턴스 객체에서도 static 정적필드를 사용할 수 있다.
		System.out.println(a.n); // 3
	}
}
