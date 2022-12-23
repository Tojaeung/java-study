package ch9_리플렉션.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 클래스 정보 가져오는 방법1
		// Class<?> clazz = Person.class;

		// 클래스 정보 가져오는 방법2
		// Class<?> clazz2 = Class.forName("ch9_리플렉션.ex1.Person");

		// 클래스 정보 가져오는 방법3
		Person person = new Person();
		Class<?> clazz3 = person.getClass();

		// System.out.println(clazz.getName());
		// System.out.println(clazz2.getName());
		System.out.println(clazz3.getName());

	}
}
