package 컬렉션프레임워크.list.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class App {
	public static void main(String[] args) {

		// 저장공간 생성자로 지정 가능

		List<Integer> list = new ArrayList<>(20); // 디폴트는 10...
		List<Integer> vector = new Vector<>(20); // 디폴트는 10...
		// List<Integer> linkedList = new LinkedList<>(20); // 단, LinkedList는 예외
	}
}
