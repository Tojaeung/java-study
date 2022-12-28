package ch13_컬렉션프레임워크.map.ex1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {

		/* 1. Key는 Set으로 관리되기 때문에 출력순서가 일정하지 않다. */
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "나다호다");
		hashMap.put(1, "나다호다2");
		hashMap.put(3, "나다호다");

		System.out.println(hashMap); // {1=나다호다2, 3=나다호다}

		/* 2. LinkedHashMap은 입력순서로 출력된다. */
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(3, "나다호다");
		linkedHashMap.put(1, "나다호다");
		linkedHashMap.put(2, "나다호다");

		System.out.println(linkedHashMap); // {3=나다호다, 1=나다호다, 2=나다호다}
	}
}
