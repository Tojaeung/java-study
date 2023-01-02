package 상속과다형성.part1;

public class Fruit {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Grape grape = new Grape();
		Kiwi kiwi = new Kiwi();

		Apple[] appleArr = new Apple[] { apple }; // 사과 타입밖에 못온다.
		Grape[] grapeArr = new Grape[] { grape };// 포도 타입밖에 못온다.
		Kiwi[] kiwiArr = new Kiwi[] { kiwi };// 키위 타입밖에 못온다.

		Fruit[] fruitArr = new Fruit[] { apple, grape, kiwi }; // Fruit을 상속받는 모든 클래스의 객체가 올 수 있다.
	}
}

class Apple extends Fruit {

}

class Grape extends Fruit {

}

class Kiwi extends Fruit {

}
