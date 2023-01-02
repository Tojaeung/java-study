package 리플렉션.ex3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		// 클래스 정보
		Class<?> personClass = Person.class;

		// private 생성자이기 때문에 오류
		// personClass.getDeclaredConstructor().newInstance();

		Constructor<?> constructor = personClass.getDeclaredConstructor();
		// private 생성자 접근
		constructor.setAccessible(true);
		Person person = (Person) constructor.newInstance();

		Method[] methods = personClass.getDeclaredMethods();
		for (Method method : methods) {
			// getName
			// setName
			// setAge
			// getAge
			System.out.println(method.getName());
		}

		// 인자 있는 메서드
		Method declaredMethod = personClass.getDeclaredMethod("setName", String.class); // 두번째인자는 파라미터
		declaredMethod.invoke(person, "나다호다");
		System.out.println(person.name); // 나다호다

		// 인자 없는 메서드
		Method declaredMethod2 = personClass.getDeclaredMethod("getName");
		System.out.println(declaredMethod2.invoke(person));

		// 인자가 여러개 일때는 클래스 배열로 넣어준다.

	}
}
