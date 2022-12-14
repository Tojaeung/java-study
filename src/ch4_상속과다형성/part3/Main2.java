package ch4_상속과다형성.part3;

// 메서드 오버라이딩 효용
public class Main2 {
	public static void main(String[] args) {
		// 다형적표현
		Animal bird = new Bird();
		Animal dog = new Dog();
		Animal cat = new Cat();

		// 배열로 한번에 관리 가능
		Animal[] animals = new Animal[] { bird, cat, dog };
		for (Animal animal : animals) {
			animal.cry();
		}
	}
}

class Animal {
	void cry() {
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}

}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}