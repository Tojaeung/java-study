package ch13_컬렉션프레임워크.list.ex4;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		/* 1. ArrayList vs LinkedList 저장방식 */

		// 데이터의 내부 저장방식이 index를 사용
		ArrayList<Integer> list = new ArrayList<>(20);
		// index 방식이 아닌 앞뒤 객체의 위치정보를 저장
		// LinkedList<Integer> linkedList = new LinkedList<>(20); // 에러

	}
}
