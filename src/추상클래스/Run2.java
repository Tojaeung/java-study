package 추상클래스;

abstract class A {
	abstract void methodA();
}

class B extends A {
	@Override
	void methodA() {
		System.out.println("안녕");
	}
}

public class Run2 {
	public static void main(String[] args) {
		/*
		 * 상속을 통한 객체생성 방법의 잠정은...
		 * 추상메서드를 한번 재정의 해두면 계속 재사용할 수 있다.
		 */
		B b1 = new B();
		b1.methodA();

		B b2 = new B();
		b2.methodA();
	}
}
