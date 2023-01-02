package 상속과다형성.part2;

public class Person {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Student();

		if (person1 instanceof Student == false) { // true, false
			System.out.println("b1은 자식클래스 C로 다운캐스팅을 할 수 없습니다.");
		}

		if (person2 instanceof Student) { // true, false
			System.out.println("b2은 자식클래스 C로 다운캐스팅을 할 수 있습니다.");
		}
	}
}

class Student extends Person {
}
