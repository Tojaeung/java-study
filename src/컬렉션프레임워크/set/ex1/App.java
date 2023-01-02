package 컬렉션프레임워크.set.ex1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {

		/* 1. Set 컬렉션 중복저장 불가 */
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(1);
		System.out.println(hashSet); // [1, 2]

		/* 2. 입력순서대로 출력되지 않는다 */
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("다");
		hashSet2.add("라");
		hashSet2.add("나");
		System.out.println(hashSet2); // [다, 나, 라]

		/* 3. LinkedHashSet 입력순서대로 출력된다. */
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("다");
		linkedHashSet.add("라");
		linkedHashSet.add("나");
		System.out.println(linkedHashSet); // [다, 라, 나]

		/* 4. TreeSet 오름차순으로 출력된다. */
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("다");
		treeSet.add("라");
		treeSet.add("나");
		System.out.println(treeSet); // [나, 다, 라]

	}
}
