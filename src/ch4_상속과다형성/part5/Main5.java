package ch4_상속과다형성.part5;

import java.util.*;
import java.lang.String;

public class Main5 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "데이터1");

		// key가 1로 같기 때문에 데이터2로 변경된다.
		hm.put(1, "데이터2");
		hm.put(2, "데이터3");
		System.out.println(hm); // {1=데이터2, 2=데이터3}

		HashMap<A, String> hm2 = new HashMap<>();
		A a1 = new A("첫번째");
		A a2 = new A("첫번째");
		A a3 = new A("두번째");

		// A의 위치로 hashCode() 메서드가 작동된다.
		// A의 위치는 모두 다르다.
		hm2.put(a1, "데이터1");
		hm2.put(a2, "데이터2");
		hm2.put(a3, "데이터3");
		System.out.println(hm2); // {첫번째=데이터1, 첫번째=데이터2, 두번째=데이터3}

		HashMap<B, String> hm3 = new HashMap<>();
		B b1 = new B("첫번째");
		B b2 = new B("첫번째");
		B b3 = new B("두번째");

		// B의 필드값으로 hashCode()가 작동한다.
		hm3.put(b1, "데이터1");
		hm3.put(b2, "데이터2");
		hm3.put(b3, "데이터3");
		System.out.println(hm3); // {첫번째=데이터2, 두번째=데이터3}

	}

}

class A {
	String name;

	public A(String name) {
		this.name = name;
	}
}

class B {
	String name;

	public B(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

}