package ch2_Class내부구성요소;

public class A {
	// 필드
	private int m = 3;
	private int n = 4;

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m); // 3
		System.out.println(a.n); // 4
		a.work1(); // 5, 7
	}

	private void work1() {
		int k = 5; // 지역변수
		System.out.println(k);
		work2(3);
	}

	private void work2(int i) { // 지역변수(파라미터)
		int j = 4; // 지역변수
		System.out.println(i + j);
	}
}
