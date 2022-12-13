package ch1_String참조자료형;

public class Hello2 {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		// 리터럴로 선언된 String 클래스의 문자열 값이 값은 경우 하나의 객체를 공유
		String str2 = "안녕";
		String str3 = "안녕";

		String str4 = new String("안녕");

		System.out.println(str1 == str2); // false
		System.out.println(str2 == str3); // true (하나의 객체공유)
		System.out.println(str3 == str4); // false
		System.out.println(str4 == str1); // false
	}
}
