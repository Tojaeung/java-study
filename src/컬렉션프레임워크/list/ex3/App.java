package 컬렉션프레임워크.list.ex3;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// 컬렉션 객체생성 방법

		/* 1. 배열에서 리스트 객체로 */
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };

		List<Integer> asList = Arrays.asList(arr);
		asList.set(1, 100);
		// asList.add(123); // 에러
		// asList.remove(1); // 에러

		System.out.println(asList); // [1, 100, 3, 4, 5]

		/* 2. 리스트를 배열로 변환 */
		Object[] arr2 = asList.toArray(); // 타입 선언 안하면 Object타입 배열 리턴
		Integer[] arr3 = asList.toArray(new Integer[5]);

		/* 3. toArray메서드 특징 */
		Integer[] arr4 = asList.toArray(new Integer[0]); // 배열 크기보다 작으면 배열 크기에 맞춰 생성
		System.out.println(Arrays.toString(arr4)); // [1, 2, 3, 4, 5]
		Integer[] arr5 = asList.toArray(new Integer[7]); // 배열 크기보다 크면 나머지는 초기화된다.
		System.out.println(Arrays.toString(arr5)); // [1, 2, 3, 4, 5, null, null]
	}
}
