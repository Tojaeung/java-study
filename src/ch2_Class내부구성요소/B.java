package ch2_Class내부구성요소;

public class B {
	private int m;
	private int n;

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.m); // 0
		System.out.println(b.n); // 0
	}

	private void work1() {
		int k;
		// System.out.println(k); // 오류
	}
}
