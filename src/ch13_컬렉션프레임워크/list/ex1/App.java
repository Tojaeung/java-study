package ch13_컬렉션프레임워크.list.ex1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
	public static void main(String[] args) {

		/* 1. 배열과 리스트의 크기차이 */

		// 배열의 저장공간 크기 고정
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };

		// arr[5] = 6; 배열크기이상으로 추가시, 에러
		arr[2] = null;
		arr[3] = null;
		System.out.println(arr.length); // 배열크기 고정(5)

		// 리스트의 저장공간 크기 동적변환
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.size()); // 배열크기 증가 5

		list.remove(1);
		list.remove(2);
		System.out.println(list.size()); // 배열크기 감소 3

		/* 2. 배열 리스트의 출력차이 */

		// 배열 출력
		System.out.println(Arrays.toString(arr)); // [1,2,null,null,5]
		// 리스트 출력
		System.out.println(list); // [1,3,5]
	}
}
