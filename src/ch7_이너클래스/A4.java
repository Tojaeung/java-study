package ch7_이너클래스;

public class A4 {
	int a = 3;
	static int b = 4;

	static class B4 {
		void print() {
			// static 메서드때문에 객체를 생성하기전에 a를 가져올수 없다.
			// System.out.println(a); // 에러
			System.out.println(b); // 4
		}
	}

	public static void main(String[] args) {
		B4 b4 = new A4.B4(); // static 경로로 바로 객체생성 가능
		b4.print();
	}
}
