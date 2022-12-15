package ch5_abstract;

abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	// cry() 메서드를 반드시 오버라이딩 해야한다고 컴파일에러 발생...
	// void cRy() {
	// System.out.println("멍멍");
	// }

	void cry() {
		System.out.println("멍멍");
	}
}

public class Run {

}
