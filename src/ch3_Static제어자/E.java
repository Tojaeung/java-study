package ch3_Static제어자;

public class E {
	private int a;
	private static int b;

	// static 초기화 블록
	static {
		b = 5;
	}

	public static void main(String[] args) {
		System.out.println(E.b); // 5
	}
}
