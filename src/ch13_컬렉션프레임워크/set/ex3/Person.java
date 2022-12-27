package ch13_컬렉션프레임워크.set.ex3;

import java.util.Objects;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// name 같으면 같은 해쉬값을 생성
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			if (this.name == ((Person) obj).name) {
				return true;
			}
		}
		return false;
	}
}
