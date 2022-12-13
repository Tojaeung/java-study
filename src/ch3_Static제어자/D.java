package ch3_Static제어자;

public class D {
	private static int n;
	private static boolean m;
	private static String k;
	private static int[] arr;

	public static void main(String[] args) {
		System.out.println(n); // 0
		System.out.println(m); // false
		System.out.println(k); // null
		System.out.println(arr); // null
	}
}
