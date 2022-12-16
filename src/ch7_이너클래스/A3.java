package ch7_이너클래스;

public class A3 {
	int a = 3;
	int b = 4;

	class B3 {
		int a = 5;
		int b = 6;

		void print() {
			System.out.println(this.a); // 5
			System.out.println(this.b); // 6
			System.out.println(A3.this.a); // 3
			System.out.println(A3.this.b); // 4
		}
	}

	public static void main(String[] args) {
		A3 a3 = new A3();
		A3.B3 b3 = a3.new B3();
		b3.print();
	}
}
