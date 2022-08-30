package jcf.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ch4_iterator {
    public static void main(String[] args) {

        // 컬렉션에 저장된 데이터를 읽어오는데 사용한다.
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        it = list.iterator();   // 1회용 다시선언

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // map에는 iterator이 없다. keySet, entryset, values를 호출 사용
        HashMap map = new HashMap();
        map.put(1, "hello");
        map.put(2, "world");

        // map을 set으로 바꿔주고 iteratior사용
        Iterator it2 = map.entrySet().iterator(); // map에서 set

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        Iterator it3 = map.values().iterator(); // map에서 collection으로
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
    }
}
