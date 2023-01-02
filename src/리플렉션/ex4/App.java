package 리플렉션.ex4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class App {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		// 클래스 정보
		Class<?> personClass = Person.class;

		// 객체 생성
		Constructor<?> declaredConstructor = personClass.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		Person person = (Person) declaredConstructor.newInstance();

		Field[] declaredFields = personClass.getDeclaredFields();
		for (Field field : declaredFields) {
			// name
			// age
			System.out.println(field.getName());
		}

		// 필드 가져오기
		Field declaredField = personClass.getDeclaredField("name");
		Field declaredField2 = personClass.getDeclaredField("age");

		// 필드값 지정
		declaredField.set(person, "나다호다");
		declaredField2.set(person, 32);

		// 확인
		System.out.println(person.name);
		System.out.println(person.age);

	}
}
