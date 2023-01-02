package 추상클래스;

abstract class A {
	abstract void methodA();
}

public class Run {
	public static void main(String[] args) {

		// 익명이너클래스 사용
		A a = new A() {
			@Override
			void methodA() {
				System.out.println("안녕");
			}
		};
		a.methodA(); // 안녕
	}
}
