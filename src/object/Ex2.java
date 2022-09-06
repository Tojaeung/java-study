package object;

public class Ex2 {
    public static void main(String[] args) {

        // 하나의 객체 주소값에 저장(리터럴 할당을 지향하자)
        String a = "123";
        String b = "123";
        String c = "123";

        // 객체의 주소가 같기 때문에 true
        System.out.println(a == b); // true
        System.out.println(b == c); // true
        System.out.println(a == c); // true

        System.out.println(a.equals(b));

        // 각자의 객체 주소값에 저장
        String a2 = new String("123");
        String b2 = new String("123");
        String c2 = new String("123");

        // 객체의 주소가 다르기 떄문에 false
        System.out.println(a2 == b2);   // false
        System.out.println(b2 == c2);   // false
        System.out.println(a2 == c2);   // false

        /*
         *  String은 인스턴스 주소를 담고 있기 때문에 동등연산자로 비교할 수 없다.(==)
         *  equals로 비교한다.
         * */
        System.out.println(a2.equals(b2));// true
        System.out.println(b2.equals(c2));// true
        System.out.println(a2.equals(c2));// true
        
    }
}
