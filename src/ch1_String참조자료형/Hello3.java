package ch1_String참조자료형;

public class Hello3 {
	public static void main(String[] args) {

		/*
		 * String 객체의 값은 바꿀수 없기때문에
		 * "안녕하세요!" 문자열 값을 만들기 위해
		 * 힙 영역에서 5개의 String 객체가 만들어진다.
		 */
		String str1 = "안녕" + "하세요" + "!";
		System.out.println(str1);
	}
}
