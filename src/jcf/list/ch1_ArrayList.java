package jcf.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ch1_ArrayList {

    public static void main(String[] args) {
        // ======간단한 배열과 ArrayList 차이 ======= //
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        // int[] arr2 = new int[3];
        // arr2[0] = 1;
        // arr2[1] = 2;
        // arr2[2] = 3;
        // // 배열은 초기화시 고정되기 대문에 사이즈 변경 불가하다. (에러발생)
        // arr2[3] = 4;
        //
        // System.out.println(arr2);

        ArrayList list = new ArrayList(3);
        list.add(1);
        list.add(2);
        list.add(3);
        // 크기가 가변적이기 떄문에 에러가 발생하지 않음
        list.add(4);

        System.out.println(list);

        // ======== ArrayList 실습 ========= //
        ArrayList list2 = new ArrayList(5);
        list2.add(new Integer(5));

        /*
         * ArrayList에는 객체만 들어가는데 어떻게 int가 올수 있을까
         * 자바 컴파일러가 auto boxing기능을 수행해서 primitice type을 객체로 변환해주기 때문이다.
         * */
        list2.add(3);
        list2.add(new Integer(1));
        list2.add(new Integer(2));
        list2.add(new Integer(4));

        System.out.println(list2);

        // list2의 인덱스 1에서 2까지 추출한다.
        ArrayList extratingList = new ArrayList(list2.subList(1, 3));
        System.out.println(extratingList);

        /*
         * ArrayList정렬
         * Array정렬은 Arrays.sort()
         * */
        Collections.sort(list2, Collections.reverseOrder());    // 내림차순

        System.out.println(list2);
        System.out.println(list2.containsAll(extratingList));   // true


        ArrayList list3 = new ArrayList(5);
        list3.add(new Integer(5));
        list3.add(new Integer(3));
        list3.add(new Integer(1));
        list3.add(new Integer(2));
        // 지정된 인덱스에 집어 넣기
        list3.add(4, 4);

        System.out.println("list3 = " + list3);

        // indexOf: 해당요소가 있는 인덱스를 반환한다.
        System.out.println("index = " + list3.indexOf(3));
        // remove: 해당 인덱스의 요소가 삭제된다. 삭제된 요소를 반환한다. 
        System.out.println("remove = " + list3.remove(0));
        // remove: 객체를 넣으면 해당요소가 삭제된다.(auto boxing이 안된다.)
        System.out.println("remove = " + list3.remove(new Integer(3)));
        System.out.println(list3);

    }
}
