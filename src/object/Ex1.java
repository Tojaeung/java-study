package object;

import java.util.Objects;

public class Ex1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        // equals
        if (v1.equals(v2)) System.out.println("v1과 v2는 같습니다.");
        else System.out.println("v1과 v2는 다릅니다.");

        // hashCode
        System.out.println(v1.hashCode());  // 41
        System.out.println(v2.hashCode());  // 41
        // 두 객체의 지역변수가 10으로 같아서 해쉬코드가 동일하다.
        System.out.println(v1.hashCode() == v2.hashCode());

        // equals가 참이면 hashCode도 참이다.
    }
}

class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }


    public boolean equals(Object obj) {

        if (!(obj instanceof Value)) return false;

        // obj의 지역변수를 참조하기 위해서 Value로 형변환을 한다.
        Value v = (Value) obj;

        // 서로 다른 객체는 주소가 아닌 value를 비교한다.
        return this.value == v.value;
    }

    @Override
    public int hashCode() {
        // 해쉬코드는 객체의 지역변수를 이용해서 만들어진다.
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }
}
