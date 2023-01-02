package Class내부구성요소;

public class C {

	public static void main(String[] args) {
		print(); // 안녕하세요
		print(12); // 12
		print(2, 4); // 2, 4
		print(1, "안녕"); // 1, "안녕"
	}

	// static메서드 main 함수에서 호출되기 위해 static으로 설정
	public static void print() {
		System.out.println("안녕하세요!!");
	}

	// static메서드 main 함수에서 호출되기 위해 static으로 설정
	public static void print(int a) {
		System.out.println(a);
	}

	// static메서드 main 함수에서 호출되기 위해 static으로 설정
	public static void print(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	// static메서드 main 함수에서 호출되기 위해 static으로 설정
	public static void print(int a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
}
