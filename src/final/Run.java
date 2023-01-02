package ch5_final;

class A {
	int n = 3;
	final int m = 5;

	A() {
		n = 7;
		// m = 9; // final 값 변경 불가능
	}
}

class B {
	void methodB() {
		int n = 3;
		final int m = 5;

		n = 7;
		// m = 9; // final 값 변경 불가능
	}

}

public class Run {
	public static void main(String[] args) {

	}
}
