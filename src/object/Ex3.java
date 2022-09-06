package object;

public class Ex3 {
    public static void main(String[] args) {
        // 문자열을 결합하는데 3개의 인스턴스가 사용된다.
        String a = "hellow";
        String b = "world";

        String c = a + b;
        System.out.println(c);

        // 문자열 변환하는데 1개의 인스턴스만 사용한다.
        StringBuffer sb = new StringBuffer(5);
        sb.append("zz").append("abc").append("a");

        System.out.println(sb.capacity());  // sb의 버퍼사이즈
        System.out.println(sb);
    }
}
