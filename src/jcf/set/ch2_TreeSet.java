package jcf.set;

import java.util.Set;
import java.util.TreeSet;

public class ch2_TreeSet {
    public static void main(String[] args) {
        /*
         * 범위검색, 정렬에 좋다.
         * 부모보다 작은값은 왼쪽, 큰값은 오른쪽에 저장
         * 데이터가 많아질수록 추가, 삭제에 시간이 걸린다. (비교 횟수 증가)
         * */
        Set set = new TreeSet();    // 정렬 필요없다.
        set.add(43);
        set.add(32);
        set.add(53);
        set.add(3);
        set.add(67);

        System.out.println(set);

        TreeSet set2 = new TreeSet();
        set2.add("car");
        set2.add("cat");
        set2.add("disc");
        set2.add("dance");
        set2.add("elephant");
        set2.add("flower");

        // 트리셋은 범위검색에 유리하다. (from ~ to)
        System.out.println(set2.subSet("c", "d"));  // car, cat 

        TreeSet set3 = new TreeSet();
        set3.add(43);
        set3.add(32);
        set3.add(53);
        set3.add(3);
        set3.add(67);

        // 미만 (범위 검색)
        System.out.println(set3.headSet(4));
        // 이상 (범위 검색)
        System.out.println(set3.tailSet(32));


    }
}
