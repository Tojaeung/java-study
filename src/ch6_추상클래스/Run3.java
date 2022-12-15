package ch6_추상클래스;

abstract class A {
	abstract void methodA();
}

public class Run3 {
	public static void main(String[] args) {
		// 익명이너클래스의 장점은 상속클래스를 만들지 않고 객체생성을 할 수 있다.
		// 그러나, 객체 생성시 마다 재정의해줘야한다.
		A a1 = new A() {
			@Override
			void methodA() {
			}
		};

		A a2 = new A() {
			@Override
			void methodA() {
			}
		};
	}
}
