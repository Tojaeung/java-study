package jcf.list;

import java.util.LinkedList;

public class ch2_LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("5");
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);

        System.out.println(list);

        list.add(1, 1000);

        System.out.println(list);

        System.out.println(list.get(3));

        System.out.println(list.indexOf("5"));

        /*
         * 추가, 삭제등 데이터 변경에 빠르다.
         * 그러나, 불연속적이기 때문에 조회가 느리다.
         * 즉, 검색이 많은경우 ArrayList , 변경이 많은경우 LinkedList
         * */
    }
}
