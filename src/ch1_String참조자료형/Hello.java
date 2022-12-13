package ch1_String참조자료형;

public class Hello {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = str1;

		// String 객체내의 값 변경시 새로운 객체를 생성한다.
		str1 = "안녕하세요";

		System.out.println(str1); // 안녕하세요
		System.out.println(str2); // 안녕

	}
}
