package 직렬화.ex1;

import java.io.Serializable;

public class Employ implements Serializable {
	String name;
	int age;
	String position;

	public Employ(String name, int age, String position) {
		this.name = name;
		this.age = age;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employ [name=" + name + ", age=" + age + ", position=" + position + "]";
	}

}
