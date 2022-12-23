package ch9_리플렉션.ex2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// 클래스 정보
		Class<?> clazz = Person.class;

		// 인자없는 생성자 찾기
		Constructor<?> constructor = clazz.getDeclaredConstructor();

		// private 생성자 접근 허용
		constructor.setAccessible(true);

		Person person = (Person) constructor.newInstance();
		System.out.println(person);

		// 인자있는 생성자 찾기
		Constructor<?> constructor2 = clazz.getConstructor(new Class[] { String.class, int.class });
		// constructor2.setAccessible(true);
		Person person2 = (Person) constructor2.newInstance("존", 32);
		System.out.println(person2.name);
		System.out.println(person2.age);

		person2.age = 52;
		System.out.println(person2.age);
	}
}
