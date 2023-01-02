package 리플렉션.ex2;

public class Person {
	String name;
	int age;

	// 접근 제한 생성자에 리플렉션으로 접근한다.
	private Person() {
	}

	// 리플렉션 접근하려면 public ??
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
