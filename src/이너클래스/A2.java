package 이너클래스;

public class A2 {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;

	void print() {
		System.out.println("안녕");
	}

	class B2 {
		void innerPrint() {
			// 같은 클래스 A2의 멤버이기떄문에 모든 접근제어자에 접근 가능
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			print(); // 외부클래스 메서드 접근
		}
	}

	public static void main(String[] args) {
		A2 a2 = new A2();
		A2.B2 b2 = a2.new B2();

		b2.innerPrint(); // 3,4,5,6,안녕
	}
}
