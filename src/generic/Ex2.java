package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {

        // 이터레이터 제네릭
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("자바왕"));
        list.add(new Student("자바짱"));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {

            // 제네릭 안쓰면 형변환이 필요하다.....
            // Student s = (Student) it.next();
            // System.out.println(s.name);

            System.out.println(it.next().name); // 깔끔....
        }


        // 해쉬맵 제네릭
        HashMap<String, Student> map = new HashMap<>();
        map.put("자바왕", new Student("자바왕"));
        
        System.out.println(map.get("자바왕").name); // 제네릭 덕분에 편하게 조회 가능
    }

}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}
