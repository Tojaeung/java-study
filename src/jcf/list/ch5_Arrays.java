package jcf.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ch5_Arrays {

    public static void main(String[] args) {
        /*
         * 순차검색과 이진검색 차이
         * 이진검색은 반으로 나누고 크냐 작냐를 비교하면서 검색하기 떄문에 정렬이 되어 있어야한다.
         * */
        int[] arr = {3, 2, 0, 1, 4};

        // 배열에서 2를 찾아라
        int index = Arrays.binarySearch(arr, 2);

        // 그러나, 결과는 -5 ?????????????
        System.out.println(index);

        // 정렬하고
        Arrays.sort(arr);
        // 검색한다.
        int modifiedIindex = Arrays.binarySearch(arr, 2);
        System.out.println(modifiedIindex);

        /*
         * 배열을 리스트로 변환
         *
         * */
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        // List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        // 읽기만 가능하기 때문에 추가할 수 없다.
        // list.add(6);


        // 다형성을 활용해서 list로 선언해주었다. ArrayList로 선언해도 된다.
        List list2 = new ArrayList(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        list2.add(6);   // 오류 안남,,;;;

        System.out.println(list2);

    }
}
