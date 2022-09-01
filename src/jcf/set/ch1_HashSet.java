package jcf.set;

import java.util.*;

public class ch1_HashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(36745);
        set.add(20);
        set.add(33);
        set.add(54);
        set.add(1);

        /*
         * [1 , 1, 2, 3]
         * set은 순서가 없기 떄문에 어떤 1이 String인지 integer인지 알 수 없다.
         * */
        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /*
         * set은 순서가 없기 떄문에 정렬을 할 수 없다.
         * 그래서, list로 바꿔준다음 정렬한다.
         * */
        LinkedList list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);


        HashSet set2 = new HashSet();
        set2.add("abc");
        set2.add("abc");

        /*
         * 저장할 객체의 equals, hashcode를 호출해서 같은 객체인지 비교한다.
         * equals, hashcode를 못하게 되면 다른 객체로 인지된다.
         * */
        set2.add(new Person("David", 10));
        set2.add(new Person("David", 10));

        System.out.println(set2);


    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
