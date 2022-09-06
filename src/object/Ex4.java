package object;

public class Ex4 {
    public static void main(String[] args) {
        int i = 5;
        Integer integer = new Integer(7);

        /*
         * 원래 기본형과 참조형의 연산 안됐음
         * 이제는 컴파일러가 자동으로 바꿔주고 연산을 한다.
         * 원칙이 바뀐게하니라 컴파일러에 기능이 추가된거임..
         * */
        int sum = i + integer;
        System.out.println(sum);
    }
}
