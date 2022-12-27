package ch13_컬렉션프레임워크.set.ex4;

import java.util.Comparator;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		// TreeSet 생성자로 Comparator<T> 인터페이스를 제공한다.
		TreeSet<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.age > o2.age) {
					return -1;
				}
				return 1;
			}
		});

		treeSet.add(new Person(32));
		treeSet.add(new Person(33));
		treeSet.add(new Person(34));

		for (Person person : treeSet) {
			System.out.println(person.age); // 34, 33, 32
		}
	}
}
