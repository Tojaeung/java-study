package 인터페이스;

interface A {
	static void print() {
		System.out.println("안녕~");
	}
}

public class Run4 {
	public static void main(String[] args) {
		// 객체 생성없이 바로 접근
		// 클래스 내부 정적 메서드와 동일
		A.print();
	}
}
