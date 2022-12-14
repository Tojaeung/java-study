package ch4_상속과다형성.part1;

public class Human {
	String name = "토재웅";
	int age = 12;

	void eat() {
	}

	void sleep() {
	}

	public static void main(String[] args) {
		Student student = new Student(); // 학생은 학생이다.
		Human student2 = new Student(); // 학생은 인간이다.
		// Student Human = new Human(); // 인간은 학생이다. (에러)

		System.out.println(student.name); // 토재웅
		System.out.println(student.age); // 12
		student.eat();
		student.sleep();

	}
}

class Student extends Human {
	int studentId;

	void goSchool() {
	}
}
