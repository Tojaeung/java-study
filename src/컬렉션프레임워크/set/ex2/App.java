package 컬렉션프레임워크.set.ex2;

public class App {
	public static void main(String[] args) {

		// Integer, String은 내부적으로 equals가 재정의 되어있다.
		Integer integer = new Integer(1);
		Integer integer2 = new Integer(1);
		System.out.println(integer == integer2); // false
		System.out.println(integer.equals(integer2)); // true

		String str = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str == str2); // false
		System.out.println(str.equals(str2)); // true

	}
}
