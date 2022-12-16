package ch7_이너클래스;

public class A5 {
	int a = 3;

	void print() {
		int b = 5;
		int c = 10;

		class B5 {
			void print2() {
				a = 7;
				System.out.println(a); // 7
				System.out.println(b); // 5

				// 지역변수 b는 final로 선언되어 있기 떄문에 변경불가
				// b = 7; // 에러

			}
		}
		B5 b5 = new B5();
		b5.print2();
	}
}
