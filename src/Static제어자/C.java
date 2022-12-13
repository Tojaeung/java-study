package Static제어자;

public class C {
	private int a;
	private static int b;

	private void method1() {
		// a, b, method2, method3 사용가능
	}

	// 객체생성 이전에 static 정적메서드 저장
	private static void method2() {
		// b, method3 사용가능
	}

	// 객체생성 이전에 static 정적메서드 저장
	private static void method3() {
		// b, method2 사용가능
	}
}
