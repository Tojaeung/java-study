package 열거형.ex4;

public enum Singleton {
	INSTANCE("존", 43);

	private String name;
	private int age;

	// 열거상수 객체를 초기화 시킨다.(힙영역 저장)
	private Singleton(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}
