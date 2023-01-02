package 열거형.ex3;

public enum Beverage {
	AMERICANO(2000) {
		public void show() {
			System.out.println("아메리카노 가격은 " + getPrice() + "입니다.");
		}
	},
	LATTE(3000) {
		public void show() {
			System.out.println("라떼 가격은 " + getPrice() + "입니다.");
		}
	},
	WATER(500) {
		public void show() {
			System.out.println("물 가격은 " + getPrice() + "입니다.");
		}
	}

	;

	private final int price;

	Beverage(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	// Enum에서 추상메서드 사용
	// 상수에서 재정의 가능하기 때문에 확장성, 유연성 증가
	// 상수를 사용할때 꼭 구현해야하는 메서드
	public abstract void show();
}
