package ch13_컬렉션프레임워크.set.ex3;

import java.util.HashSet;

public class App {
	public static void main(String[] args) {

		Person person = new Person("나다호다");
		Person person2 = new Person("나다호다");

		// 해쉬값이 아니라 객체참조주소값을 비교하기 때문에 false
		System.out.println(person == person2); // false
		System.out.println(person.equals(person2)); // true

		HashSet<Person> hashSet = new HashSet<>();
		hashSet.add(person);
		hashSet.add(person2);
		System.out.println(hashSet.size()); // 중복O: 1

	}
}
