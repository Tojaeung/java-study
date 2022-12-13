package ch2_Class내부구성요소;

public class D {
	public static void main(String[] args) {
		print(1, 2, 3, 4, 5); // 1,2,3,4,5
		print("안", "녕", "하", "세", "요"); // 안,녕,하,세,요
	}

	// 가변길이 배열 매개변수 문법
	public static void print(int... values) {
		for (int value : values) {
			System.out.println(value);
		}
	}

	// 가변길이 배열 매개변수 문법
	public static void print(String... values) {
		for (String value : values) {
			System.out.println(value);
		}
	}
}
